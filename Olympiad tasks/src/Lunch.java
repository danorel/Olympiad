import java.util.Scanner;

public class Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A - bananas, B - apples, C - pineapples
        long A, B, C;
        long Result;
        do{
            A = scanner.nextInt();
        } while(A < 0 || A > 1e6);
        do{
            B = scanner.nextInt();
        } while(B < 0 || B > 1e6);
        do{
            C = scanner.nextInt();
        } while(C < 0 || C > 1e6);
        System.out.println(A * B + B * C + C * A);
    }
}
