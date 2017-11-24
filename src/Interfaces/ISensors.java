package Interfaces;
import java.util.ArrayList;

public interface ISensors {

     String TrafficData = "";
     ArrayList<Double> Location = null;
     ArrayList<Double> sensorData = null;

     ArrayList<Double> getLocation();
     void setLocation(ArrayList<Double> location);
     ArrayList<Double> getSensorData();
     String getTrafficData();
     void setSensorData(ArrayList<Double> sensorData);
     void setTrafficData(String trafficData);
}
