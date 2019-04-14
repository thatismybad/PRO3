import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeService {
    Calendar c;

    public TimeService() {
        c = new GregorianCalendar();
    }

    public String getTimeString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        return "Právě je " + sdf.format(c.getTime());
    }
}
