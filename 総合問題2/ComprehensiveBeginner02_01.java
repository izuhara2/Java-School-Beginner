
/**
 * 新規Java ファイル「ComprehensiveBeginner02_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

スロットマシーンプログラムを作成してください。
"ゾロ目で大当たり！チャンスは30回"と表示させる
"begin と入力してください> " と入力すると、開始するようにする
ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる
*/

import java.util.Random;
import java.util.Scanner;

public class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {

        System.out.println("ゾロ目で大当たり!チャンスは30回");

        System.out.print("begin と入力してください> ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.equals("begin")) {

            for (int i = 1; i <= 30; i++) {

                int num1 = new Random().nextInt(9) + 1;
                int num2 = new Random().nextInt(9) + 1;
                int num3 = new Random().nextInt(9) + 1;
                int[] data = new int[3];
                data[0] = num1;
                data[1] = num2;
                data[2] = num3;

                if (num1 == num2 && num2 == num3) {

                    System.out.print(i + "回目：");
                    for (int x = 0; x < 3; x++) {

                        System.out.print(data[x]);

                    }

                    System.out.print("\n");
                    System.out.println(i + "回目で大当たりです。おめでとうございます！");
                    break;

                } else {

                    System.out.print(i + "回目：");
                    for (int x = 0; x < 3; x++) {

                        System.out.print(data[x]);

                    }

                    System.out.print("\n");
                    if (i == 30) {
                        
                        System.out.println("残念でした。終わります。");
                        
                    }
                }
            }
        }
        scan.close();
    }
}
