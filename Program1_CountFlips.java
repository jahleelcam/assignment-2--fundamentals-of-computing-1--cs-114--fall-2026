import java.util.Random;

public class Program1_CountFlips {
    private static final int MAX = 100;
    private static int faceValue;

    public static void main(String[] args) {

        Random random = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 100; i++) {
            faceValue = random.nextInt(MAX) + 1;

            if (faceValue <= 50) {
                heads++;
                System.out.println("Heads");
            } else {
                tails++;
                System.out.println("Tails");
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}