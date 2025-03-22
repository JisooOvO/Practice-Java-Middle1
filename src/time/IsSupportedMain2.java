package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); // 초 단위 없음
        System.out.println("now = " + now);

        System.out.println("now.isSupported(ChronoField.SECOND_OF_MINUTE) = " + now.isSupported(ChronoField.SECOND_OF_MINUTE));

        // int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 초에 접근 시 Unsupported 에러 발생
        // System.out.println("minute = " + minute);
    }
    
}
