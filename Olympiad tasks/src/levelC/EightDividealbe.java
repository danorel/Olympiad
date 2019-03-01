import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class EightDividealbe {
    public static void main(String[] args) {
        EightDividealbe ED = new EightDividealbe();
        ED.run();
    }

    // 1, 2, 3 digits
    // if last 3 digits divide by 8, all the number divides by 8
    // sort the string

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int DigitLength = 1, counter = 0, MIN;
        BigInteger BI = scanner.nextBigInteger();
        int DecimalNumber = BI.intValue();
        while(DecimalNumber > 10){
            DecimalNumber /= 10;
            DigitLength++;
        }

        char [] Number = new char[DigitLength];
        String num = Integer.toString(BI.intValue());
        Number = num.toCharArray();


        DecimalNumber = BI.intValue();
        if(DecimalNumber % 8 == 0){
            MIN = DecimalNumber;
        } else {
            MIN = -1;
        }

        for(; counter < factorial(DigitLength); counter++){

        }

        System.out.println(MIN);
    }

    private int factorial(int NumberLength){
        if(NumberLength == 0 || NumberLength == 1){
            return 1;
        } else {
            return NumberLength * factorial(NumberLength - 1);
        }
    }

//    private int MIN;
//
//    public void permutation(String str) {
//        this.MIN = Integer.parseInt(str);
//        permutation("", str);
//    }
//
//    private void permutation(String prefix, String str) {
//        int n = str.length();
//        if (n == 0) {
//            if(Integer.parseInt(prefix) % 8 == 0 && Integer.parseInt(prefix) < this.MIN && prefix.charAt(0) != '0'){
//                MIN = Integer.parseInt(prefix);
//            }
//        }
//        else {
//            for (int i = 0; i < n; i++)
//                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
//        }
//    }
//
//    public void run(){
//        Scanner scanner = new Scanner(System.in);
//        String Number = scanner.nextLine();
//        permutation(Number);
//        System.out.println(this.MIN);
//    }
//
//    public static void main(String[] args) {
//        EightDividealbe ED = new EightDividealbe();
//        ED.run();
//    }
}
