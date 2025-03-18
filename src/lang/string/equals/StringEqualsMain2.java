package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
    }

    static boolean isSame(String x, String y) {
        // 문자열은 항상 동등성 비교
        // return x == y;
        return x.equals(y);
    }

}
