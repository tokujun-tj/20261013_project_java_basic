package chapter_12.practice.ques_08;

public class Prices {
    public static void main(String[] args) {
        int[] prices = {1200, 800, 3000, 500};
        int total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        System.out.println("合計 " + total + " 円");
    }
}
