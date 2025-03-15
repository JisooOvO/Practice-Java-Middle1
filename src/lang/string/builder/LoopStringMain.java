package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "";

        for(int i = 0 ; i < 100000; i++){
            // 반복문 내에서 문자열 최적화가 어려움
            // result = new StringBuilder().append(result).append(Hello Java )...
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }

}
