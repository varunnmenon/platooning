package BusinessObjects;


import Interfaces.INetworkMonitor;

import java.util.ArrayList;

public class NetworkMonitor implements INetworkMonitor {
    private ArrayList<Vehicle> vehicles;
    private double PlatoonSpeed;
    private double PlatoonDistance;
    private double PlatoonSize;

    public void setPlatoonDistance(double platoonDistance) {
        PlatoonDistance = platoonDistance;
    }

    public double getPlatoonDistance() {
        return PlatoonDistance;
    }

    public void setPlatoonSize(double platoonSize) {
        PlatoonSize = platoonSize;
    }

    public void setPlatoonSpeed(double platoonSpeed) {
        PlatoonSpeed = platoonSpeed;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public double getPlatoonSize() {
        return PlatoonSize;
    }

    public double getPlatoonSpeed() {
        return PlatoonSpeed;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
