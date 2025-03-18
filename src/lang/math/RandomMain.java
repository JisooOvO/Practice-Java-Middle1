package lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        // Random random = new Random();
        // 시드가 같으면 결과가 같다
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위
        int randomRange1 = random.nextInt(10);// 0 ~ 9
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;// 1 ~ 10
        System.out.println("randomRange2 = " + randomRange2);
    }
    
}
