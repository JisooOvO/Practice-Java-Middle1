package lang.clazz;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. Class 조회
        Class clazz = String.class;
        // 2. 인스턴스에서 조회
        // Class clazz1 = new String().getClass();
        // 3. 문자열로 조회
        // Class clazz2 = Class.forName("java.lang.String");

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " +
                    field.getType() + " " +
                    field.getName()
            );

            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("annotation : " + annotation);
            }
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method + " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass : " +
                clazz.getSuperclass().getName()
        );

        // 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("Interface : " + anInterface);
        }

    }

}
