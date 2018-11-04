import java.util.Date;
import java.util.Scanner;

public class LazySanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startYear, endYear, Times, counter = 0;
        do {
            Times = scanner.nextInt();
        } while (Times < 1);
        do {
            do {
                startYear = scanner.nextInt();
            } while (startYear < 1920 || startYear > 2050);
            do {
                endYear = scanner.nextInt();
            } while (endYear < 1920 || endYear > 2050);
            counter++;
        } while (startYear > endYear || counter < Times);
        // May(5)
        // October(10), January(1) 17
        // Jul(7), April(4) 18
        // Sept(9), Dec(12) 19
        // March(3), Nov(11) 20
        // Aug(8) 21
        // May(5) 22

    }
}
