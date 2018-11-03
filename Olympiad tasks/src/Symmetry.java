import java.util.Scanner;

public class Symmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number, middle = 0, leftValue = 0, rightValue = 0, counter = 0;
        int SymmetryCount = 0;
        String str;
        do {
            Number = scanner.nextInt();
            if(Number <= 0) System.out.print("You've entered non-natural number. Repeat please: ");
        } while(Number <= 0);
        str = Integer.toString(Number);
        middle = str.length() / 2;
        if(str.length() % 2 == 0){
            do {
                leftValue = middle - 1 - counter;
                rightValue = middle + counter;
                if (str.charAt(leftValue) == str.charAt(rightValue)) SymmetryCount++;
                counter++;
            } while(leftValue != 0 || (rightValue != str.length() - 1));
        } else {
            SymmetryCount++;
            counter = 1;
            do{
                leftValue = middle - counter;
                rightValue = middle + counter;
                if(str.charAt(leftValue) == str.charAt(rightValue)) SymmetryCount++;
                counter++;
            } while(leftValue != 0 || (rightValue != str.length() - 1));

        }
        System.out.println(SymmetryCount);
    }
}
