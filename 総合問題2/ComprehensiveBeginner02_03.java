
/*
 * 新規Java ファイル「ComprehensiveBeginner02_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
buyDrink() メソッドを持つ、Coffee クラスを使用する
buyDrink() メソッドを持つ、Juice クラスを使用する
 */

public class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {

        Juice juice1 = new Juice();
        Juice juice2 = new Juice();

        juice1.name = "バリヤース";
        juice2.name = "午後の紅茶";

        juice1.buyDrink();
        juice2.buyDrink();

        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee();

        coffee1.name = "ボス";
        coffee2.name = "ジョージア";

        coffee1.buyDrink();
        coffee2.buyDrink();

    }
}

class Coffee {

    String name;

    public void buyDrink() {

        System.out.println(

            switch (name) {

                case "ボス" -> "ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。";
                case "ジョージア" -> "ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。";
                default -> "";

            }

        );
    }

}

class Juice {

    String name;

    public void buyDrink() {
        System.out.println(

            switch (name) {

                case "バリヤース" -> "バヤリース の オレンジ 味です。130 円になります。";
                case "午後の紅茶" -> "午後の紅茶 の レモンティー 味です。150 円になります。";
                default -> "";

            }
            
        );

    }

}