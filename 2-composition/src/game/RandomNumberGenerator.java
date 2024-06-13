package game;

import math.RandomNumber;

public class RandomNumberGenerator {
    private RandomNumber random;

    public RandomNumberGenerator() {
        this.random = new RandomNumber();
    }

    public int generate(int bound) {
        return random.getRandomInt(bound);
    }
}
