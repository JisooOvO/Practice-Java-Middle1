package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 포맷팅 : 날짜와 시간을 문자로
        LocalDateTime dt = LocalDateTime.of(2024, 12, 31, 13, 30, 59);

        System.out.println("dt = " + dt);
        System.out.println("dt.format(formatter) = " + dt.format(formatter));

        // 파싱
        String dateTimeString = "2030-01-01 11:30:30";
        System.out.println("LocalDateTime.parse(dateTimeString, formatter) = " + LocalDateTime.parse(dateTimeString, formatter));
    }

}
