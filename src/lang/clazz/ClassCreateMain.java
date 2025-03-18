package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        // 사용자 입력 기반으로 인스턴스 동적 생성
        Class helloClass = Class.forName("lang.clazz.Hello");

        // 리플렉션
        // 클래스 생성자를 가져오기
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }

}
