import java.util.Scanner;
public class Canteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A - Vanilla cake, B - Chocolate cake, C - Fruits cake
        long A, B, C;
        do{
            A = scanner.nextInt();
        } while(A < 0 || A > 2e4);
        do{
            B = scanner.nextInt();
        } while(B < 0 || B > 2e4);
        do{
            C = scanner.nextInt();
        } while(C < 0 || C > 2e4);
        System.out.println(A + B + C);
    }
}
