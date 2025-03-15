package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // auto boxing
        // primitive -> wrapper
        int value = 7;
        Integer boxedValue = value;

        // auto unboxing
        // wrapper -> primitive
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
