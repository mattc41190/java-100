package clock;

import java.util.Date;

class Clocker {
    public void tellTime(){
        Date date = new Date();
        System.out.println(date.toString());
    }
}
