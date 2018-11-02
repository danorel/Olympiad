import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, counter = 0;
        do{
            number = scanner.nextInt();
        } while(number < 0 || number > 2 * 1e9);
        if(number < 10){
            counter = 1;
        } else {
            while(number >= 10) {
                number /= 10;
                counter++;
            }
            counter++;
        }
        System.out.println(counter);
    }
}