package com.iiuc.transportation.model;

public class Model {

    private Long id;
    private Integer capacity;
    private String busNumber;
    private String routeName;
    private String driverName;
    private String schedule;
    private String semester;
    private String driverPhone;
    private String busType;
    private String pickupPoint;
    private String status;
    private String userType;
    public Model() {

    }

    public Model(Long id, String busNumber, String routeName,
            String driverName, Integer capacity,
            String schedule, String semester,
            String driverPhone, String busType,
            String pickupPoint, String status,String userType) 
    {
        this.id = id;
        this.busNumber = busNumber;
        this.routeName = routeName;
        this.driverName = driverName;
        this.capacity = capacity;
        this.schedule = schedule;
        this.semester = semester;
        this.driverPhone = driverPhone;
        this.busType = busType;
        this.pickupPoint = pickupPoint;
        this.status = status;
        this.userType= userType;
    }

    

    public Long getId() {
        return id;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getDriverName() {
        return driverName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getSemester() {
        return semester;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public String getBusType() {
        return busType;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public String getStatus() {
        return status;
    }
    public String getUserType() {
        return userType;
    }


    

    public void setId(Long id) {
        this.id = id;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }

}
