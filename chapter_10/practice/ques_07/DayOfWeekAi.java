package chapter_10.practice.ques_07;

public class DayOfWeekAi {
    public static void main(String[] args) {
        System.out.print("曜日番号を入力してください（1〜7）：");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int dayNumber = scanner.nextInt();

        String dayOfWeek = switch (dayNumber) {
            case 1 -> "月曜日";
            case 2 -> "火曜日";
            case 3 -> "水曜日";
            case 4 -> "木曜日";
            case 5 -> "金曜日";
            case 6, 7 -> "休日";
            default -> "範囲外の番号です";
        };

        System.out.println(dayOfWeek);
    }
}
