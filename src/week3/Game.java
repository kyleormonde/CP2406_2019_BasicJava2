package week3;

import java.util.Random;

public class Game {
    public int wins;
    public int count;
    //    Secret is assigned a random value between 1-10 inclusive.
    private Random random = new Random();
    int secret = random.nextInt(10) + 1;
}
