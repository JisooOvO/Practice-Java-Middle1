package lang.string.method;

public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf
        System.out.println("int의 문자열 값 : " + String.valueOf(num) );
        System.out.println("boolean의 문자열 값 : " + String.valueOf(bool) );
        System.out.println("str의 문자열 값 : " + String.valueOf(str) );

        // 문자 + X -> 문자
        System.out.println("" + num);

        // toCharArray
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray); // obj
        // System.out.println(strCharArray); // String

        for (char c : strCharArray) {
            System.out.println(c);
        }
    }

}
