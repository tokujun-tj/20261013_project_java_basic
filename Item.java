public class Item { // class（プログラムのまとまり）Itemを定義します。
    public static void main(String[] args) { // main（実行開始地点）を定義します。
        String title = "徳永と申します。よろしくお願いいたします。"; // String（文字列、文字の並び）型のtitleに買い物の内容を入れます。
        boolean done = false;
        int count = 3;
        String html = "<li>" + title + "</li>"; // +（文字列をつなぐ記号）でHTML（Webページ用の書式）を作ります。
        System.out.println(html); // 作ったHTMLをターミナル（コマンド入力画面）に1行表示します。
        System.out.println(done);
        System.out.println("いま" + count + "件");
    } // mainの範囲を閉じます。
} // Itemの範囲を閉じます。
