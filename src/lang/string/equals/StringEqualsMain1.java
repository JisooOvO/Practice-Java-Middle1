package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        // 인스턴스
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        // 문자열 리터럴 / 문자열 풀 => 성능 최적화 / Heap 영역 / 해시 알고리즘 O(N)
        String str3 = "hello"; // 실행 시점에 리터럴이 있으면 문자열 풀을 생성
        String str4 = "hello"; // 중복되는 문자열 풀은 생략

        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }

}
