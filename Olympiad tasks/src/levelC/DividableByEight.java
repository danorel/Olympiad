import java.math.BigInteger;
import java.util.Scanner;

public class DividableByEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberLength = 1, counter = 0, MIN;
        BigInteger BI = scanner.nextBigInteger();
        int DecimalNumber = BI.intValue();
        while(DecimalNumber > 10){
            DecimalNumber /= 10;
            NumberLength++;
        }

        char [] Number = new char[NumberLength];
        String num = Integer.toString(BI.intValue());
        Number = num.toCharArray();

        DecimalNumber = BI.intValue();
        if(DecimalNumber % 8 == 0){
            MIN = DecimalNumber;
        } else {
            MIN = -1;
        }
        while(counter != NumberLength){
            if(MIN >= swapDigits(DecimalNumber, counter, Number)) {
                MIN = swapDigits(DecimalNumber, counter, Number);
            }
            DecimalNumber = BI.intValue();
            num = Integer.toString(BI.intValue());
            Number = num.toCharArray();
            counter++;
        }
        System.out.println(MIN);
    }

    private static int swapDigits(int decimalNumber, int numberLength, char[] Number) {
        char temp = Number[numberLength];
        int num1, num2;
        int MIN = decimalNumber;
        String number;
        for(int counter = Number.length - 1; counter > numberLength; counter--){
            if(Number[0] != '0'){
                number = String.valueOf(Number);
                decimalNumber = Integer.parseInt(number);
                if(decimalNumber % 8 == 0 && decimalNumber <= MIN){
                    MIN = decimalNumber;
                }
                num1 = (int)Number[counter];
                num2 = (int)Number[numberLength];
                Number[counter] = (char)num2;
                Number[numberLength] = (char)num1;
            }
        }
        return MIN;
    }
}