package Lesson9;

public class Practice09_01 {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        int sum = sumUp(x, y);

        System.out.println("sum = " + sum);
    }

    private static int sumUp(int x, int y) {
        return x - y;
    }
}
