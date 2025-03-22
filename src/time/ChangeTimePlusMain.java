package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);

        // ChroniUnit
        System.out.println("dt.plus(10, ChronoUnit.YEARS) = " + dt.plus(10, ChronoUnit.YEARS));
        // 편의 메서드
        System.out.println("dt.plusYears(10) = " + dt.plusYears(10));
        // Period
        System.out.println("dt.plus(Period.ofYears(10)) = " + dt.plus(Period.ofYears(10)));

    }

}
