import java.util.Date;


public class AlfredQuotes{

    public String basicgreeting(){
        return("Hello Bot");
    }

    public String guestgreeting(String name, String dayperiod){
        return String.format("good %s, %s.", dayperiod, name);
    }

    public String dateAnnouncement() {

        return String.format("it is currently %s", new Date());
    }


}