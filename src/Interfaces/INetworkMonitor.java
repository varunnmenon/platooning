package Interfaces;

import BusinessObjects.Vehicle;

import java.util.ArrayList;

public interface INetworkMonitor {
     ArrayList<Vehicle> vehicles = null;
     double PlatoonSpeed = 0.0d;
     double PlatoonDistance = 0.0d;
     double PlatoonSize = 0.0d;

     void setPlatoonDistance(double platoonDistance);
     double getPlatoonDistance();
     void setPlatoonSize(double platoonSize);
     void setPlatoonSpeed(double platoonSpeed);
     void setVehicles(ArrayList<Vehicle> vehicles);
     double getPlatoonSize();
     double getPlatoonSpeed();
     ArrayList<Vehicle> getVehicles();
}
