package zero_base.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

    public static void main(String[] args) {

        Date today = Calendar.getInstance().getTime();
        System.out.println(today);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("year = " + year);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("formating = " + simpleDateFormat.format(today));

        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        System.out.println(localDate);
        System.out.println(localTime);

    }

}
