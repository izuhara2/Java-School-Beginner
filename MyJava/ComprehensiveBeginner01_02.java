
/** 
 * 新規Java ファイル「ComprehensiveBeginner01_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。 
*/

import java.util.Scanner;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("整数1を入力してください>");
        int inputNum1 = scanner.nextInt();

        System.out.print("整数2を入力してください>");
        int inputNum2 = scanner.nextInt();

        System.out.print("整数3を入力してください>");
        int inputNum3 = scanner.nextInt();

        if (inputNum1 > inputNum2) {
            System.out.println("NG");
        } else if (inputNum2 > inputNum3) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }

        scanner.close();
        
    }
}
