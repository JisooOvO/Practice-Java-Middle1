package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        // String은 불변 객체
        String str = "hello";

        // concat은 새로운 객체를 반환
        String str2 = str.concat(" java");

        System.out.println("str1 = " + str);
        System.out.println("str2 = " + str2);
    }

}
