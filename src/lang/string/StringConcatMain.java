package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // + 연산을 제공

        System.out.println(result1);
        System.out.println(result2);
    }

}
