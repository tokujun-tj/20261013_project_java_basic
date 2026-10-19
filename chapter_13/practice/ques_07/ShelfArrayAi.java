package chapter_13.practice.ques_07;

public class ShelfArrayAi {
    public static void main(String[] args) {
        int[][] shelf = new int[3][2];

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[i].length; j++) {
                shelf[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        for (int i = 0; i < shelf.length; i++) {
            for (int j = 0; j < shelf[i].length; j++) {
                System.out.println(shelf[i][j]);
            }
        }
    }
}
