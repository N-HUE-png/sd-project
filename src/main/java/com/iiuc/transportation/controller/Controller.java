package com.iiuc.transportation.controller;

import com.iiuc.transportation.model.Model;
import com.iiuc.transportation.services.Services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class Controller {

    private final Services services;

    // constructor injection

    public Controller(Services services) {
        this.services = services;
    }

    @GetMapping
    public List<Model> getAllBuses() {
        return services.getAllBuses();
    }

    @GetMapping("/{id}")
    public Model getBusById(@PathVariable Long id) {
        return services.getBusById(id);
    }

    @PostMapping
    public Model addBus(@RequestBody Model bus) {
        return services.addBus(bus);
    }

    @PutMapping("/{id}")
    public boolean updateBus(@PathVariable Long id,
            @RequestBody Model updatedBus) {
        return services.updateBus(id, updatedBus);
    }

    @DeleteMapping("/{id}")
    public boolean deleteBus(@PathVariable Long id) {
        return services.deleteBus(id);
    }

    @GetMapping("/route/{route}")
    public List<Model> searchByRoute(@PathVariable String route) {
        return services.searchByRoute(route);
    }

    @GetMapping("/number/{number}")
    public Model searchByBusNumber(@PathVariable String number) {
        return services.searchByBusNumber(number);
    }

    @GetMapping("/driver/{name}")
    public List<Model> searchByDriverName(@PathVariable String name) {
        return services.searchByDriverName(name);
    }

    @GetMapping("/type/{type}")
    public List<Model> searchByBusType(@PathVariable String type) {
        return services.searchByBusType(type);
    }

    @GetMapping("/pickup/{point}")
    public List<Model> searchByPickupPoint(@PathVariable String point) {
        return services.searchByPickupPoint(point);
    }

    @GetMapping("/usertype/{type}")
    public List<Model> searchByUserType(@PathVariable String type) {
        return services.searchByUserType(type);
    }

    @GetMapping("/schedule/{schedule}")
    public List<Model> searchBySchedule(@PathVariable String schedule) {
        return services.searchBySchedule(schedule);
    }

    @GetMapping("/count")
    public int totalBuses() {
        return services.totalBuses();
    }

    @PatchMapping("/{id}/status")
    public boolean updateStatus(@PathVariable Long id,
            @RequestParam String status) {
        return services.updateStatus(id, status);
    }

    @PatchMapping("/{id}/driver")
    public boolean updateDriverInfo(@PathVariable Long id,
            @RequestParam String name,
            @RequestParam String phone) {
        return services.updateDriverInfo(id, name, phone);
    }
}
