import java.util.Scanner;
/*
    This program counts the symmetry level of the number relatively to the
    middle of this number.
    If you enter: 223321 - symmetry level is 2. Pairs: (3,3), (2,2).
    If you enter: 123321 - symmetry level is 3. Pairs: (3,3), (2,2), (1,1).
    If you enter: 253367 - symmetry level is 1. Pair: (3,3).
    If you enter: 123456 - symmetry level is 0. No pairs.
 */
public class Symmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number, middleElement = 0, leftElement = 0, rightElement = 0, counter = 0;
        int SymmetryCounter = 0;
        String str;
        do {
            Number = scanner.nextInt();
            if(Number <= 0) System.out.print("You've entered non-natural number. Repeat please: ");
        } while(Number <= 0);
        str = Integer.toString(Number);
        middleElement = str.length() / 2;
        if(str.length() % 2 == 0){
            do {
                leftElement = middleElement - 1 - counter;
                rightElement = middleElement + counter;
                if (str.charAt(leftElement) == str.charAt(rightElement)) SymmetryCounter++;
                counter++;
            } while(leftElement != 0 || (rightElement != str.length() - 1));
        } else {
            SymmetryCounter++;
            counter = 1;
            do{
                leftElement = middleElement - counter;
                rightElement = middleElement + counter;
                if(str.charAt(leftElement) == str.charAt(rightElement)) SymmetryCounter++;
                counter++;
            } while(leftElement != 0 || (rightElement != str.length() - 1));

        }
        System.out.println(SymmetryCounter);
    }
}
