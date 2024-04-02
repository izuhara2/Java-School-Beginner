
import java.util.Random;

public class Practice07_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        if (age <= 3) {
            if (gender == 0) {
                System.out.println("あなたは babyな男 です");
            } else if (gender == 1) {
                System.out.println("あなたは babyな女 です");
            }
        } else if (6 <= age && age < 18) {
            if (gender == 0) {
                System.out.println("あなたは kidな男 です");
            } else if (gender == 1) {
                System.out.println("あなたは kidな女 です");
            }
        } else if (18 <= age) {
            if (gender == 0) {
                System.out.println("あなたは adultな男 です");
            } else if (gender == 1) {
                System.out.println("あなたは adultな女 です");
            }
        }
    }
}
