package Interfaces;

import BusinessObjects.GUI;
import BusinessObjects.Sensors;

public interface IVehicle {

     int vehicleId = 0;
     String message = "";
     Sensors VehicleSensor = null;
     GUI vehicleGUI = null;
     double vehicleSpeed = 0.0d;
     double vehicleDistance = 0.0d;

     void setMessage(String message);
     int getVehicleId();
     String getMessage();
     void setVehicleId(int vehicleId);
     Sensors getVehicleSensor();
     void setVehicleSensor(Sensors vehicleSensor);
     GUI getVehicleGUI();
     void setVehicleGUI(GUI vehicleGUI);
     double getVehicleDistance();
     double getVehicleSpeed();
     void setVehicleDistance(double vehicleDistance);
     void setVehicleSpeed(double vehicleSpeed);
}
