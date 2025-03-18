package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초) 가져오기
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노) 가져오기
        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos = " + currentTimeNanos);

        // 운영체제 환경 변수 가져오기
        System.out.println("getenv = " + System.getenv());

        // 자바 속성을 읽음
        System.out.println("properties = " + System.getProperties());

        // 배열을 고속으로 복사
        char[] originArray =  {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originArray,0, copiedArray, 0, originArray.length);

        System.out.println("originArray = " + originArray);
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
    }

}
