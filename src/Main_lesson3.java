import java.util.Scanner;

public class Main_lesson3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int range = 9;
        int number = (int) (Math.random() * range);
        guessNumber(range, number);
        scanner.close();
    }

    //task 1

    public static void guessNumber(int range, int number) {
        System.out.println("Ваша задача угадать число за 3 попытки.");
        int tryCount = 0;
        int maxTryCount = 3;
        while (tryCount < maxTryCount) {
        System.out.println("Угадайте число от 0 до " + range + ". У Вас " + (maxTryCount - tryCount) + " попытки.");
        int playerNumber = scanner.nextInt();

            if (playerNumber == number) {
                System.out.println("Поздравляю, Вы угадали! Загаданное число было " + number + ". \nПовторить игру еще раз? 1 - да / 0 - нет");
                break;
            }
            else if (playerNumber > number) {
                System.out.println("Вы ввели число больше загаданного.");
                tryCount++;
            } else if (playerNumber < number){
                System.out.println("Вы ввели число меньше загаданного.");
                tryCount++;
            }

            if (tryCount == maxTryCount) {
                System.out.println("Вы проиграли! Загаданное число было " + number + ". \nПовторить игру еще раз? 1 - да / 0 - нет");
            }
        }
    }
}
