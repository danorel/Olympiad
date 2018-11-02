import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            number = scanner.nextInt();
        } while(number > 99 || number < 10);
        int partOne = number / 10;
        int partTwo = number % 10;
        System.out.println(partOne + " " + partTwo);
    }
}