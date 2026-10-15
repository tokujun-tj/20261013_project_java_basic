package chapter_06.practice.ques_07;

public class SnackShare {
    public static void main(String[] args) {
        int snacks = 23;
        int people = 5;

        int perPerson = snacks / people;
        int remainder = snacks % people;

        System.out.println("1人あたりの個数：" + perPerson);
        System.out.println("余りの個数：" + remainder);
    }
}
