package chapter_14.section_14_4;

public class BookToolAi {
    public static void main(String[] args) {
        int totalPages = add(320, 180);
        int days = divide(totalPages, 30);

        System.out.println("2冊で " + totalPages + " ページ");
        System.out.println("1日30ページなら " + days + " 日");
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int divide(int number1, int number2) {
        return number1 / number2;
    }
}
