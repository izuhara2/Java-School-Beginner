package Lesson8;

import java.util.Scanner;

public class Practice08_05 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("何段>");
        int inputNum = scanner.nextInt();

        while (inputNum <= 0 || inputNum > 5) {
            System.out.print("何段>");
            inputNum = scanner.nextInt();
        }

        for (int i = 1; i <= inputNum; i++) {
            String answer = "";
            for (int j = 0; j < 5 - i; j++) {
                answer += " ";
            }
            for (int k = 0; k < i; k++) {
                answer += "*";
            }
            System.out.println(answer);
        }

        scanner.close();
    }
}
