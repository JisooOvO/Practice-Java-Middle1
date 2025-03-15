package lang.wrapper;

public class WrapperCLassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // 미리 사용하는 숫자 -128 ~ 127 재사용
        System.out.println("newInteger = " + newInteger);

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);
        
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        // valueOf로 == 비교할 경우 cache 값을 가져오므로 true
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + (newInteger.equals(integerObj)));
    }
    
}
