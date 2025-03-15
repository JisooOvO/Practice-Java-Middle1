package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // StringBuilder를 바깥에서 정의 -> 내부에서는 클래스를 만들지 않음!

        // StringBuilder - 멀티스레드 안전X , 빠름
        // StringBuffer - 멀티스레드 안전O, 느림(오버헤드)
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < 100000; i++){
            result.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result.toString());
        System.out.println("time = " + (endTime - startTime) + "ms");
    }

}
