package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        // int -> Integer
        Integer i1 = Integer.valueOf(10);

        // String -> Integer
        Integer i2 = Integer.valueOf("10");

        // String -> int
        int intValue = Integer.parseInt("10");

        // 비교
        System.out.println("compareTo : " + i1.compareTo(20));

        // 연산
        System.out.println("sum : " + Integer.sum(10, 20));
        System.out.println("min : " + Integer.min(10, 20));
        System.out.println("max : " + Integer.max(10, 20));

    }

}
