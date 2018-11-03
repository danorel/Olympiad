import java.util.Scanner;
public class WithoutMiddle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number;
        do{
            Number = scanner.nextInt();
        } while(Number < 100 || Number > 999);
        System.out.println(Number / 100 + "" + Number % 10);
    }
}
