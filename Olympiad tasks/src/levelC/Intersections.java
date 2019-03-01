import java.util.Scanner;

public class Intersections {
    public static void main(String[] args) {
        new Intersections().run();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        long SummaryIntersections = 0;
        long A = scanner.nextInt();
        long B = scanner.nextInt();
        SummaryIntersections = (A*(A-1)*B*(B-1))/4;
        System.out.println(SummaryIntersections);
    }
}
