package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        // 현재
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 : " + nowTime);

        // 지정
        LocalTime ofTime = LocalTime.of(9, 10, 30);
        System.out.println("지정 시간 = " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("지정 시간 + 30s = " + ofTimePlus);
    }

}
