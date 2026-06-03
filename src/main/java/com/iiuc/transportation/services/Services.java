package com.iiuc.transportation.services;

import com.iiuc.transportation.model.Model;
import java.util.ArrayList;
import java.util.List;

public class Services {

    private List<Model> buses = new ArrayList<>();
    private Long idCounter = 1L;

    // 1
    public Model addBus(Model bus) {
        bus.setId(idCounter++);
        buses.add(bus);
        return bus;
    }

    // 2
    public List<Model> getAllBuses() {
        return buses;
    }

    // 3
    public Model getBusById(Long id) {
        for (Model b : buses) {
            if (b.getId().equals(id))
                return b;
        }
        return null;
    }

    // 4
    public boolean deleteBus(Long id) {
        for (Model b : buses) {
            if (b.getId().equals(id)) {
                buses.remove(b);
                return true;
            }
        }
        return false;
    }

    // 5
    public boolean updateBus(Long id, Model newBus) {
        Model old = getBusById(id);
        if (old != null) {
            old.setBusNumber(newBus.getBusNumber());
            old.setRouteName(newBus.getRouteName());
            old.setDriverName(newBus.getDriverName());
            old.setCapacity(newBus.getCapacity());
            old.setSchedule(newBus.getSchedule());
            old.setSemester(newBus.getSemester());
            old.setDriverPhone(newBus.getDriverPhone());
            old.setBusType(newBus.getBusType());
            old.setPickupPoint(newBus.getPickupPoint());
            old.setStatus(newBus.getStatus());
            old.setUserType(newBus.getUserType());
            return true;
        }
        return false;
    }

    // 6
    public List<Model> searchByRoute(String route) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getRouteName().equals(route))
                result.add(b);
        }
        return result;
    }

    // 7
    public List<Model> searchBySemester(String semester) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getSemester().equals(semester))
                result.add(b);
        }
        return result;
    }

    // 8
    public Model searchByBusNumber(String number) {
        for (Model b : buses) {
            if (b.getBusNumber().equals(number))
                return b;
        }
        return null;
    }

    // 9
    public int totalBuses() {
        return buses.size();
    }

    // 10
    public List<Model> searchByDriverName(String name) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getDriverName().equals(name))
                result.add(b);
        }
        return result;
    }

    // 11
    public Model searchByDriverPhone(String phone) {
        for (Model b : buses) {
            if (b.getDriverPhone().equals(phone))
                return b;
        }
        return null;
    }

    // 12
    public List<Model> searchByBusType(String type) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getBusType().equals(type))
                result.add(b);
        }
        return result;
    }

    // 13
    public List<Model> searchByPickupPoint(String point) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getPickupPoint().equals(point))
                result.add(b);
        }
        return result;
    }

    // 14
    public List<Model> searchByStatus(String status) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getStatus().equals(status))
                result.add(b);
        }
        return result;
    }

    // 15
    public List<Model> searchByUserType(String type) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getUserType().equals(type))
                result.add(b);
        }
        return result;
    }

    // 16
    public List<Model> searchBySchedule(String schedule) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getSchedule().equals(schedule))
                result.add(b);
        }
        return result;
    }

    // 17
    public List<Model> searchByCapacity(Integer cap) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getCapacity().equals(cap))
                result.add(b);
        }
        return result;
    }

    // 18
    public List<Model> capacityGreaterThan(int min) {
        List<Model> result = new ArrayList<>();
        for (Model b : buses) {
            if (b.getCapacity() > min)
                result.add(b);
        }
        return result;
    }

    // 19
    public boolean updateStatus(Long id, String status) {
        Model b = getBusById(id);
        if (b != null) {
            b.setStatus(status);
            return true;
        }
        return false;
    }

    // 20
    public boolean updateDriverInfo(Long id, String name, String phone) {
        Model b = getBusById(id);
        if (b != null) {
            b.setDriverName(name);
            b.setDriverPhone(phone);
            return true;
        }
        return false;
    }
}
