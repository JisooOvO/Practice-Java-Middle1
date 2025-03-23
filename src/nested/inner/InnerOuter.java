package nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print(){
            // 자기 자신
            System.out.println(innerInstanceValue);

            // 외부 클래스 인스턴스 접근 가능
            System.out.println(outInstanceValue);
            System.out.println(outClassValue);
        }
    }
}
