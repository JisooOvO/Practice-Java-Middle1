package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();
        scanner.nextLine();
        
        printCalender(year, month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate nextMonth = firstDayOfMonth.plusMonths(1);

        // 월요일 1 ~ 일요일 7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for(int i = 0 ; i < offsetWeekDays ; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(nextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            dayIterator =  dayIterator.plusDays(1);
        }
    }

}
