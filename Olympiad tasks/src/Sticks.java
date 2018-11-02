import java.util.Scanner;
public class Sticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberOfSticks = 12;
        int maxNumber = 1;
        int maxNumberOfSticks = 2000000000;
        int number, Addition = 8;

        while(NumberOfSticks < maxNumberOfSticks){
            NumberOfSticks += Addition;
            maxNumber++;
        }
        NumberOfSticks = 12;
        do{
            number = scanner.nextInt();
        } while(number < 0 || number > maxNumber);
        if(number == 0){
            NumberOfSticks = 0;
        } else if(number == 1){
            NumberOfSticks = 12;
        } else {
            while(number != 1){
                NumberOfSticks += Addition;
                number--;
            }
        }
        System.out.println(NumberOfSticks);
    }
}