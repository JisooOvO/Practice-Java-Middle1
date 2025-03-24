package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // effectively final -> final은 아니지만 값을 변경하지 않은 지역변수
        int localVar = 1; // 지역 변수 - 스택 프레임이 종료되는 순간 사라짐

        // 지역 클래스가 접근하는 변수는 final/effectively final
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 오래 살아 남음
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        // localPrinter.print();
        // Printer 인스턴스만 반환
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        // process()의 스택 프레임이 사라진 다음 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
