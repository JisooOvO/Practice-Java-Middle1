package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        // 반환 값을 받아야 함
        obj1 = obj1.add(20);

        System.out.println("obj1.value = " + obj1.getValue());

    }

}
