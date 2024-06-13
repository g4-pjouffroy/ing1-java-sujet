package math;

import java.util.Random;

public class RandomNumber {
    private Random random;

    public RandomNumber() {
        this.random = new Random();
    }

    public int getRandomInt(int bound) {
        return random.nextInt(bound);
    }
}
