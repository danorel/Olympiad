import java.util.Scanner;

public class DivideTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do{
            Number = scanner.nextInt();
        } while(Math.abs(Number) > 999);
        if(Number > 0){
            System.out.println(Number / 100);
            System.out.println((Number / 10) % 10);
            System.out.println(Number % 10);
        } else {
            System.out.println(-(Number / 100));
            System.out.println(-((Number / 10) % 10));
            System.out.println(-(Number % 10));
        }
    }
}
