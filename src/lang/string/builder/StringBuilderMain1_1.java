package lang.string.builder;

// Srting - 불변
// StringBuilder - 가변
public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");

        System.out.println("sb : " + sb);

        sb.insert(1, "Java");
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        String string = sb.toString();
        System.out.println("string = " + string);
    }

}
