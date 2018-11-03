import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        do {
            n = in.nextInt();
        }while (10 > n || n > 99);
        int b = n / 10;
        int c = n % 10;
        System.out.print(b + " " + c);
    }
}