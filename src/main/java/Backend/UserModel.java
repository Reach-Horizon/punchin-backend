package Backend;

import java.security.Timestamp;
import java.time.LocalDate;


public class UserModel {


    private String IP;
    private LocalDate pinDate;
    private Timestamp time;

    public LocalDate getPinDate() {
        return pinDate;
    }

    public void setPinDate(LocalDate pinDate) {
        this.pinDate = pinDate;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

}



