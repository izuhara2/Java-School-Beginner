import java.util.Random;

public class Practice07_05 {
    public static void main(String[] args) {
        int man = new Random().nextInt(3) + 1;
        int woman = new Random().nextInt(3) + 1;
        int child = new Random().nextInt(3) + 1;

        System.out.println(man);
        System.out.println(woman);
        System.out.println(child);

        if (man != woman && woman != child ) {
            System.out.println("あいこです");
        } else if (man == woman) {
            if (woman == child) {
                System.out.println("あいこです");
            } else if (woman > child) {
                System.out.println("man と woman が勝ちました");
            } else if (woman < child) {
                System.out.println("child が勝ちました");
            }
        } else if (woman == child) {
            if (child > man) {
                System.out.println("woman と child が勝ちました");
            } else if (child < man) {
                System.out.println("man が勝ちました");
            }
        } else if (child == man) {
            if (man > woman) {
                System.out.println("child と man が勝ちました");
            } else if (man < woman) {
                System.out.println("woman が勝ちました");
            }
        }
    }
}
