package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        // 참조형
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 사이드 이펙트(Side Effect) 방지
        // b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
