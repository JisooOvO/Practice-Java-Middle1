package nested.nested;

public class NestedOuter {
    private static int outClassVlaue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print(){
            // 자기 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스에 접근 불가
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 private 클래스 멤버 접근 가능
            System.out.println(outClassVlaue);
        }
    }


}
