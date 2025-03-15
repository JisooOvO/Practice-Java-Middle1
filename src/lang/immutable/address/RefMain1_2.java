package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // 참조형
        Address a = new Address("서울");
        // 사이드 이펙트(Side Effect) 제거
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
