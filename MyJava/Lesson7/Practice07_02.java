import java.util.Random;

public class Practice07_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);

        if (age <= 3) {
            System.out.println("あなたは baby です");
        } else if (3 < age && age < 18) {
            System.out.println("あなたは kid です");
        } else {
            System.out.println("あなたは adult です");
        }
    }
}
