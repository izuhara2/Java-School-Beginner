package Lesson8;

public class Practice08_02 {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 2 }, { 3, 4, 5 } };

        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.println(arr[i][x]);
            }
        }
    }
}
