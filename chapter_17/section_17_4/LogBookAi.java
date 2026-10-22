package chapter_17.section_17_4;

public class LogBookAi {
    String title;
    int readPages;

    public void addRead(int pages) {
        this.readPages += pages;
    }

    public void show() {
        System.out.println(this.title + "：" + this.readPages + "ページまで読んだ");
    }
}
