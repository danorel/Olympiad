import java.io.*;
import java.util.Scanner;
public class TwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, r1, x2, y2, r2;
        double restriction = 1e9;
        // Checking X1;
        do {
            x1 = scanner.nextDouble();
        } while (Math.abs(x1) > restriction);
        //xw Checking Y1;
        do {
            y1 = scanner.nextDouble();
        } while (Math.abs(y1) > restriction);
        // Checking R1;
        do {
            r1 = scanner.nextDouble();
        } while (r1 > restriction || r1 < 0);
        // Checking X2;
        do {
            x2 = scanner.nextDouble();
        } while (Math.abs(x2) > restriction);
        // Checking Y2;
        do {
            y2 = scanner.nextDouble();
        } while (Math.abs(y2) > restriction);
        // Checking R2;
        do {
            r2 = scanner.nextDouble();
        } while (r2 > restriction || r2 < 0);
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        // If many solutions, print "-1"
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println("-1");
        } else if (distance == r1 + r2 || distance == r2 - r1 || distance == r1 - r2) {
            System.out.println("1");
        } else if (distance < r1 + r2) {
            System.out.println("2");
        } else if (distance > r1 + r2 || distance < r2 - r1 || distance < r1 - r2){
            System.out.println("0");
        } else if(x1 == x2 && y1 == y2 && r1 != r2){
            System.out.println("0");
        }
    }
}