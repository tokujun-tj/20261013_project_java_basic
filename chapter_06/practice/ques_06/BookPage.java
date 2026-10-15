package chapter_06.practice.ques_06;

public class BookPage {
    public static void main(String[] args) {
        int totalPages = 300;
        int bookmarkPage = 120;
        int remainingPages = totalPages - bookmarkPage;

        System.out.println("本の総ページ数：" + totalPages);
        System.out.println("しおりを挟んだページ：" + bookmarkPage);
        System.out.println("残りのページ数：" + remainingPages);
    }
}
