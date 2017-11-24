package BusinessObjects;

import Interfaces.ISensors;

import java.util.ArrayList;

public class Sensors implements ISensors {
    private String TrafficData;
    private ArrayList<Double> Location;
    private ArrayList<Double> sensorData;

    public ArrayList<Double> getLocation() {
        return Location;
    }

    public void setLocation(ArrayList<Double> location) {
        Location = location;
    }

    public ArrayList<Double> getSensorData() {
        return sensorData;
    }

    public String getTrafficData() {
        return TrafficData;
    }

    public void setSensorData(ArrayList<Double> sensorData) {
        this.sensorData = sensorData;
    }

    public void setTrafficData(String trafficData) {
        TrafficData = trafficData;
    }
}
