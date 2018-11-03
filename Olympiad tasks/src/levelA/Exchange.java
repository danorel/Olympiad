import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do{
            Number = scanner.nextInt();
        } while(Number < 1000 || Number > 9999);
        System.out.println((Number / 1000) + "" + (((Number / 10) % 100) % 10) + "" + (((Number / 10) % 100) / 10) + "" + (Number % 10));
    }
}
