package variable.ex;

 import java.util.Scanner;
import java.util.Random;

public class Report1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean play = true;

        System.out.println("==============================");
        System.out.println("       [숫자맞추기게임 시작]       ");
        System.out.println("==============================");

        while (play) {
            int answer = random.nextInt(100) + 1;
            int guess;

            while (true) {
                System.out.print(">>");
                guess = scanner.nextInt();

                if (guess < answer) {
                    System.out.println("더 높게");
                } else if (guess > answer) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("맞았습니다.");
                    break;
                }
            }

            System.out.print("게임을 종료하시겠습니까?(y/n) >>");
            String response = scanner.next();

            if (response.equalsIgnoreCase("y")) {
                play = false;
            } else {
                System.out.println();
                System.out.println("==============================");
                System.out.println("       [숫자맞추기게임 시작]       ");
                System.out.println("==============================");
            }
        }

        System.out.println("==============================");
        System.out.println("       [숫자맞추기게임 종료]       ");
        System.out.println("==============================");
        scanner.close();
    }
}