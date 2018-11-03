import java.util.Scanner;
/*
    Define the triangle type:
    1 - all the sides equal to each other.
    2 - only two sides equal.
    3 - no of them are equal.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;
        do{
            A = scanner.nextInt();
        } while(A < 1 || A > 100);
        do{
            B = scanner.nextInt();
        } while(B < 1 || B > 100);
        do{
            C = scanner.nextInt();
        } while(C < 1 || C > 100);
        if(A < B + C && B < A + C && C < A + B){
            if(A == B && B == C){
                System.out.println("1");
            }
            if((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
                System.out.println("2");
            }
            if((A != B) && (B != C) && (A != C)){
                System.out.println("3");
            }
        }
    }
}
