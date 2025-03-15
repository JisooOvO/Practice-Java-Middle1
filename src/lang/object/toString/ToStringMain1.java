package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString
        // 객체 이름 + @ + 객체 참조 값
        System.out.println(string);

        // object
        // println -> valueOf -> toString 내부적으로 호출
        System.out.println(object);
    }

}
