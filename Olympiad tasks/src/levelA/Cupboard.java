import java.util.Scanner;

public class Cupboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A,B,C - parameters of the cupboard, X,Y - parameters of the door.
        int X, Y, A, B, C;
        // Width of the cupboard
        do{
            A = scanner.nextInt();
        } while(A < 1 || A > 1e2);
        // Length of the cupboard
        do{
            B = scanner.nextInt();
        } while(B < 1 || B > 1e2);
        // Height of the cupboard
        do{
            C = scanner.nextInt();
        } while(C < 1 || C > 1e2);
        // Width of the door
        do{
            X = scanner.nextInt();
        } while(X < 1 || X > 1e2);
        // Height of the door
        do{
            Y = scanner.nextInt();
        } while(Y < 1 || Y > 1e2);

        if((((A <= X && B <= Y) || (B <= X && A <= Y))) || ((A <= X && C <= Y) || (A <= Y && C <= X)) || ((B <= X && C <= Y) || (B <= Y && C <= X))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
