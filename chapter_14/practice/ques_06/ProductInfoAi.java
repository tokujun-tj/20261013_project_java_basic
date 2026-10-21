package chapter_14.practice.ques_06;

public class ProductInfoAi {
    public static void main(String[] args) {
        showProduct("ノート", 150);
        showProduct("ペン", 100);
    }

    public static void showProduct(String productName, int price) {
        System.out.println(productName + " は " + price + " 円");
    }
}
