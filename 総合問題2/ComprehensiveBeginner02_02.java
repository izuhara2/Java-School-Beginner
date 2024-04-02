
/**
 * 新規Java ファイル「ComprehensiveBeginner02_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

ジャンケンプログラムを作成してください。
"ジャンケン"と表示させる
"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
それ以外の数字が入力された場合、エラーとして説明した後に 1.  に戻るようにする
今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する
*/

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {

        System.out.println("ジャンケン");
        Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください");
        int me = scanner.nextInt();

        while (me < 0 || me > 2) {

            System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください");
            me = scanner.nextInt();
            if (me < 0 || me > 2) {

                System.out.println("0~2の数値を入力してください");

            }

        }

        int enemy = new Random().nextInt(2) + 1;

        janken(me, enemy);

        scanner.close();
    }

    private static void janken(int me, int enemy) {

        if (me == 0) {

            if (enemy == 1) {

                System.out.println("相手はチョキを出しました");
                System.out.println("勝ち");

            } else if (enemy == 2) {

                System.out.println("相手はパー出しました");
                System.out.println("負け");

            } else {

                System.out.println("相手はグーを出しました");
                System.out.println("あいこ");

            }
        } else if (me == 1) {

            if (enemy == 0) {

                System.out.println("相手はグーを出しました");
                System.out.println("負け");

            } else if (enemy == 2) {

                System.out.println("相手はパー出しました");
                System.out.println("勝ち");

            } else {

                System.out.println("相手はチョキを出しました");
                System.out.println("あいこ");

            }
        } else if (me == 2) {

            if (enemy == 0) {

                System.out.println("相手はグーを出しました");
                System.out.println("勝ち");

            } else if (enemy == 1) {

                System.out.println("相手はチョキを出しました");
                System.out.println("負け");

            } else {

                System.out.println("相手はパー出しました");
                System.out.println("あいこ");

            }
        }
    }
}
