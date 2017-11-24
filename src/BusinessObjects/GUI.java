package BusinessObjects;
import Interfaces.IGUI;


public class GUI implements IGUI {

        private String DriverMessage;
        private boolean JoinPlatoon;
        private String FailureMessage;
        private boolean ErrorAudio;

        public boolean getErrorAudio() {
            return ErrorAudio;
        }

        public boolean getJoinPlatoon() {
            return JoinPlatoon;
        }

        public String getDriverMessage() {
            return DriverMessage;
        }

        public String getFailureMessage() {
            return FailureMessage;
        }

        public void setDriverMessage(String driverMessage) {
            DriverMessage = driverMessage;
        }

        public void setErrorAudio(boolean errorAudio) {
            ErrorAudio = errorAudio;
        }

        public void setFailureMessage(String failureMessage) {
            FailureMessage = failureMessage;
        }

        public void setJoinPlatoon(boolean joinPlatoon) {
            JoinPlatoon = joinPlatoon;
        }

}
