package Lesson8;

import java.util.Scanner;

public class Practice08_05 {
    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.print("何段>");

            int inputNum = scanner.nextInt();

            if (inputNum <= 5 && inputNum >= 1) {
                i++;
            }
            if (i == 1) {
                String answer = "*";
                String result = "";

                for (int x = 1; x <= inputNum; x++) {
                    if (x >= 2) {
                        answer += "*";
                        result = answer.substring(x - 1);
                        System.out.println(result);
                    } else {
                        System.out.println(answer);
                    }

                }
            }

        }
        scanner.close();
    }
}
