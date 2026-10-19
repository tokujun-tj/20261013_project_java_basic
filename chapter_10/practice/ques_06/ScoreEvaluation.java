package chapter_10.practice.ques_06;

public class ScoreEvaluation {
    public static void main(String[] args) {
        int score = 79;
        String evaluation;

        if (score < 60) {
            evaluation = "不合格";
        } else if (score < 80) {
            evaluation = "合格";
        } else {
            evaluation = "優秀";
        }

        System.out.println(evaluation);
    }
}
