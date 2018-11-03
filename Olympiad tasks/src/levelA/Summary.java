import java.util.Scanner;
public class Summary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftValue, rightValue;
        int Number, S = 0;
        do{
            Number = scanner.nextInt();
        } while((Number < 10 && Number > -10) || (Number > 99) || (Number < -99));
        if(Number < 0){
            leftValue = -(Number / 10);
            rightValue = -(Number % 10);
        } else {
            leftValue = Number / 10;
            rightValue = (Number % 10);
        }
        S += leftValue + rightValue;
        System.out.println(S);
    }
}
