package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestLoopPLus {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        System.out.println("date = " + date);

        for (int i = 0 ; i < 5 ; i++){
            date = date.plusWeeks(2);
            System.out.println("date = " + date);
        }
    }

}
