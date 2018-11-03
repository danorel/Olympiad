import java.util.Scanner;
/*
    This program reads the Number from the console.
    Converts this Number to Binary string.
    Assign the variable Counter - binary string length.
    Make a cycle, in which we move to the left all the binary digits and the
    first digit, we assign to the end of the new binary number.
    In such a way, we change the value of decimal number.
    If this new number greater then MAX value, MAX = new number.
 */
public class CycleMovements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number, MAX;
        char[] BinarySet;
        String BinaryNumber;
        int BinaryLength;
        char firstBinaryDigit;
        String digit;
        do{
            Number = scanner.nextInt();
        } while(Number < 1 || Number > 2e9);
        MAX = Number;
        BinaryNumber = Integer.toBinaryString(Number);
        BinaryLength = BinaryNumber.length();
        BinarySet = new char[BinaryLength];
        for(int counter = 0; counter < BinaryLength; counter++){
            BinarySet[counter] = BinaryNumber.charAt(counter);
        }
        firstBinaryDigit = BinarySet[0];
        for(int BinaryCounter = 0; BinaryCounter < BinaryLength; BinaryCounter++){
            for(int i = 0; i < BinaryLength; i++){
                Number = 0;
                if(i < BinaryLength - 1){
                    BinarySet[i] = BinarySet[i + 1];
                } else {
                    BinarySet[i] = firstBinaryDigit;
                    firstBinaryDigit = BinarySet[0];
                    for(int exponent = BinaryLength - 1, digitIndex = 0; exponent >= 0; exponent--, digitIndex++){
                        digit = Character.toString(BinarySet[digitIndex]);
                        Number += Math.pow(2, exponent) * Integer.parseInt(digit);
                    }
                    if(Number >= MAX){
                        MAX = Number;
                    }
                }
            }
        }
        System.out.println(MAX);
    }
}
