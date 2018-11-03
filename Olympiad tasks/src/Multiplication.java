import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number, leftValue, middleValue, rightValue;
        int Multiplication = 1;
        do{
            Number = scanner.nextInt();
        } while (Number < 100 || Number > 999);
        leftValue = Number / 100;
        middleValue = (Number / 10) % 10;
        rightValue = ((Number % 100) % 10);
        Multiplication *= leftValue * middleValue * rightValue;
        System.out.println(Multiplication);
    }
}
