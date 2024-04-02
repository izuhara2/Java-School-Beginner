public class Practice05_01 {
    public static void main(String[] args) {
        String[] arr_01 = { "リンゴ", "バナナ", "メロン", "マスカット" };
        int[] arr_02 = { 10, 20, 100, 3 };
        String[][] arr_03 = { { "ポチ", "ジョン" }, { "タマ", "もちまる" }, { "ペンペン", "ペンギン丸" } };

        for (int i = 0; i <= 3; i++) {
            System.out.println(arr_01[i]);
        }
        for (int i = 0; i <= 3; i++) {
            System.out.println(arr_02[i]);
        }
        System.out.println(arr_03[0][0]);
        System.out.println(arr_03[0][1]);

        System.out.println(arr_03[1][0]);
        System.out.println(arr_03[1][1]);

        System.out.println(arr_03[2][0]);
        System.out.println(arr_03[2][1]);
    }
}
