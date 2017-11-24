package Interfaces;

public interface IGUI {
    String DriverMessage = "";
    boolean JoinPlatoon  = false;
    String FailureMessage = "";
    boolean ErrorAudio = false;

    boolean getErrorAudio();
    boolean getJoinPlatoon();
    String getDriverMessage();
    String getFailureMessage();
    void setDriverMessage(String driverMessage);
    void setErrorAudio(boolean errorAudio);
    void setFailureMessage(String failureMessage);
    void setJoinPlatoon(boolean joinPlatoon);
}
