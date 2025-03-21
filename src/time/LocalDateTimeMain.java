package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        // 현재
        LocalDateTime nowDt = LocalDateTime.now();

        // 지정
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println("현재 시간 = " + nowDt);
        System.out.println("지정 시간 = " + ofDt);

        // 날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        
        // 날짜 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 + 1000d = " + ofDtPlus);

        // 비교
        System.out.println("현재 날짜 < 지정 날짜 ? : " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 > 지정 날짜 ? : " + nowDt.isAfter(ofDt));

        // isEquals vs equals
        // -> isEquals는 타임존이 달라도 단순히 시간이 같으면 true
        // -> equals -> 타입, 타임존 등등 내부의 모든 구성요소가 같아야 함
        System.out.println("현재 날짜 = 지정 날짜 ? : " + nowDt.isEqual(ofDt));
    }

}
