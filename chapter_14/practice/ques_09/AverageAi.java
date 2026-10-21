package chapter_14.practice.ques_09;

public class AverageAi {
    public static void main(String[] args) {
        double average = calculateAverage(75, 80);
        System.out.println("平均は " + average + " です");
    }

    public static double calculateAverage(int first, int second) {
        return (first + (double) second) / 2;
    }
}
