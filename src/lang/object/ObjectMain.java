package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        // Object class의 메서드 toString
        String string = child.toString();
        System.out.println(string);

    }

}
