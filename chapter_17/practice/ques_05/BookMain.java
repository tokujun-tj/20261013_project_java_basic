package chapter_17.practice.ques_05;

public class BookMain {
    public static void main(String[] args) {
        BookInfo book = new BookInfo();
        book.title = "旅の記録";
        book.pages = 320;

        System.out.println(book.title);
        System.out.println(book.pages);
    }
}
