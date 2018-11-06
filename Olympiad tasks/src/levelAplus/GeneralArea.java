import java.util.Scanner;

public class GeneralArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S, counter = 0;
        System.out.print("Enter N:");
        int N = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for(int i = 0; i < N; i++, counter++){
            System.out.print("Enter X[" + (i + 1) + "]:");
            X[i] = scanner.nextInt();
            System.out.print("Enter Y[" + (i + 1) + "]:");
            Y[i] = scanner.nextInt();
            if(counter % 3 == 0){

            }
        }
    }
}
