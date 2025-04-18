package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        // zdt -> instant
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        long epochSecond = later.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);
    }

}
