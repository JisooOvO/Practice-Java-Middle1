package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        // 지금
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);

        // 지정 날짜
        LocalDate ofDate = LocalDate.of(
            2013, 11, 21
        );
        System.out.println("지정 날짜 : " + ofDate);

        // 계산
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d : " + ofDate);
    }

}
