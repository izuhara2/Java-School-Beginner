
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
        juice1.flavor = "オレンジ";
        juice2.flavor = "レモンティー";
        juice1.price = 130;
        juice2.price = 150;

        juice1.buyDrink();
        juice2.buyDrink();

        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee();

        coffee1.name = "ボス";
        coffee2.name = "ジョージア";
        coffee1.amasa = "控え目";
        coffee2.amasa = "甘め";
        coffee1.milk = "無し";
        coffee2.milk = "入り";
        coffee1.price = 110;
        coffee2.price = 120;

        coffee1.buyDrink();
        coffee2.buyDrink();

    }
}

class Coffee {

    String name;
    String amasa;
    String milk;
    int price;

    public void buyDrink() {

        System.out.println(name + "の甘さは" + amasa + "，ミルク" + milk + "です。" + price + "円になります。");

    }

}

class Juice {

    String name;
    String flavor;
    int price;

    public void buyDrink() {

        System.out.println(name + "の" + flavor + "味です。" + price + "円になります。");

    }

}