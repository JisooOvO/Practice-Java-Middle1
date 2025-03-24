package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
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

        // 만약 localVar의 값 변경시 다시 캡처를 한다?
        // 스택 영역의 값과 인스턴스 캡처 변수의 값이 달라지는 동기화 문제 발생
        // -->> 매우 많은 사이드 이펙트가 발생하므로 원천적으로 봉쇄
        // localVar = 10;
        // paramVar = 20;
        int x = localVar;
        x += 10;

        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
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
