package chapter_17.practice.ques_07;

public class BookMain {
    public static void main(String[] args) {
        BookInfo firstBook = new BookInfo();
        firstBook.title = "旅の記録";
        firstBook.pages = 320;

        BookInfo secondBook = new BookInfo();
        secondBook.title = "Java入門";
        secondBook.pages = 180;

        firstBook.showInfo();
        secondBook.showInfo();
    }
}
