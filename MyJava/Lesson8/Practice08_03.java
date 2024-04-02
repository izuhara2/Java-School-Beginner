package Lesson8;

import java.util.Random;

public class Practice08_03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int num = new Random().nextInt(6) + 1;
            int X = i;

            if (num % 2 == 1) {
                System.out.println(X + "回目，" + num + "が出ました");
            }
        }
    }
}
