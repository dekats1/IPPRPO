import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int random = new Random().nextInt(100);
            System.out.println(random);
        }
    }

}