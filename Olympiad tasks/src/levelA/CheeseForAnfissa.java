import java.util.Scanner;
/*
    Anfissa loves to eat the cheese pieces. But she is fond of small pieces, that is why she tries to chop this piece.
    Anfissa cuts such a piece of cheese on the diagonal of the square, but she can easily miss, consequently cut that piece by some angle.
    I've calculated by the knowledge of Math the area of the equidistant trapezoid, which depends on the angle, you've entered, the length of the square int the base and the height of such a parallelepiped.
 */
public class CheeseForAnfissa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Length, Height, angle;
        int accuracy = 3;
        double Area;
        Length = scanner.nextInt();
        Height = scanner.nextInt();
        angle = scanner.nextInt();
        angle = 90 - angle;
        Area = ((Length*(Length*Math.sqrt(2) - 2*Height*Math.tan(Math.toRadians(angle))))/2)*(Height / Math.cos(Math.toRadians(angle)));
        System.out.printf("%." + accuracy + "f", Area );
    }
}
