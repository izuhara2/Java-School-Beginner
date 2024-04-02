package Lesson9;

import java.util.Scanner;

public class Practice09_02 {
    public static void main(String[] args) {
        System.out.println("朝，昼，夜のいずれかを入力してください");
        Scanner scan = new Scanner(System.in, "Shift-JIS");
        String greet = scan.next();
        greet(greet);
        scan.close();
    }

    private static void greet(String greet) {
        if (greet.equals("朝")) {
            System.out.println("Good morning!!");
        } else if (greet.equals("昼")) {
            System.out.println("Good afternoon!!");
        } else if (greet.equals("夜")) {
            System.out.println("Good evening!!");
        }
    }
}
