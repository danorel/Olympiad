import java.util.Scanner;
public class SwapDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do{
            Number = scanner.nextInt();
        } while(Number < 100 || Number > 999);
        System.out.println(Number % 10 + "" + ((Number / 10) % 10) + "" + Number / 100);
    }
}
