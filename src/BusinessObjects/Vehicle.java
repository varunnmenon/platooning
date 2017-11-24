package BusinessObjects;

import Interfaces.IVehicle;

public class Vehicle implements IVehicle {

    private int vehicleId;
    private String message;
    private Sensors VehicleSensor;
    private GUI vehicleGUI;
    private double vehicleSpeed;
    private double vehicleDistance;

    public void setMessage(String message) {
        this.message = message;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getMessage() {
        return message;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Sensors getVehicleSensor() {
        return VehicleSensor;
    }

    public void setVehicleSensor(Sensors vehicleSensor) {
        VehicleSensor = vehicleSensor;
    }

    public GUI getVehicleGUI() {
        return vehicleGUI;
    }

    public void setVehicleGUI(GUI vehicleGUI) {
        this.vehicleGUI = vehicleGUI;
    }

    public double getVehicleDistance() {
        return vehicleDistance;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleDistance(double vehicleDistance) {
        this.vehicleDistance = vehicleDistance;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }
}
