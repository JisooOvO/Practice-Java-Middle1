package lang.string.method;

public class StingSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // splitedStr
        String[] splitedStr = str.split(",");
        for (String s : splitedStr) {
            System.out.println(s);
        }

        // join
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 : " + joinedStr);
        System.out.println("result : " + String.join("-", splitedStr));
    }

}
