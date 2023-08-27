package E818;

import java.util.Random;

public class Die {
    private static Random generator;
    private int sides;

    public Die(int side) {
        sides = side;
        generator = new Random();
    }

    public int cast() {
        return 1 + generator.nextInt(sides);
    }
}
