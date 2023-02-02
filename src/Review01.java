
public class Review01 {

    public static void main(String[] args) {
     //　変数の宣言・初期化
        int price = 1500; // int型変数priceを宣言し、1500を代入
        int taxRate = 10; // int型変数taxRateを宣言し、10を代入
        int result; // int型変数resultの定義

        result = tax(price, taxRate); // resultにtaxメソッドの結果(戻り値)を代入

        System.out.println(price + "円の商品の税込価格は" + (price + result) + "円(消費税は" + result + "円)です。");


    }
    public static int tax(int price, int taxRate) {

            int result = price * taxRate / 100; // 消費税算出結果を出力
            return result;
        }
}