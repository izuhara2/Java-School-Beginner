
/**
 * 新規Java ファイル「ComprehensiveBeginner01_04.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
人数を入力し、入場料の合計を計算するプログラムを作成してください。
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("人数を入力してください>");
        int member = scanner.nextInt();

        int money = 0;

        if (member >= 0 && member < 5) {

            money = 600;

        } else if (member >= 5 && member < 20) {

            money = 550;

        } else if (member >= 20) {

            money = 500;

        }
        
        int result = money * member;
        System.out.print("入場料の合計は" + result);

        scanner.close();

    }
}
