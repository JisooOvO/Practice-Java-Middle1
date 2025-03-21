package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.DAYS = " + ChronoUnit.DAYS);
        System.out.println("ChronoUnit.DAYS.getDuration().getUnits() = " + ChronoUnit.DAYS.getDuration().getUnits());

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long betweenSeconds = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("betweenSeconds = " + betweenSeconds);

        long betweenMinutes = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("betweenMinutes = " + betweenMinutes);
    }

}
