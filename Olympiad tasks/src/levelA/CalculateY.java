import java.util.Scanner;

public class CalculateY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X, Y;
        do{
            X = scanner.nextLong();
        } while(Math.abs(X) > 1e4);
        if(X >= 10) Y = (long) Math.pow(X, 3) + 5 * X;
        else Y = (long) Math.pow(X, 2) - 2 * X + 4;
        System.out.println(Y);
    }
}
