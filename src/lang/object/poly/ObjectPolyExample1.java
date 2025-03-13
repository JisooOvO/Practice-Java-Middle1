package lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object obj = new Dog();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        if(obj instanceof Dog dog) {
            dog.sound();
        }

        if(obj instanceof Car car) {
            car.move();
        }

        System.out.println(obj.toString());
        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());;
    }

}
