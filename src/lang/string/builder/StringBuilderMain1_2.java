package lang.string.builder;

// Srting - 불변
// StringBuilder - 가변
public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String result =  sb.append("A").append("B")
                            .append("C").append("D")
                            .insert(1, "Java")
                            .delete(4,8)
                            .reverse()
                            .toString();

        System.out.println("string = " + result);
    }

}
