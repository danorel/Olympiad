import java.util.Scanner;
/*
    Anfissa loves to eat the cheese pieces. But she is fond of small pieces, that is why she tries to chop this piece.
    Anfissa cuts such a piece of cheese on the diagonal of the square, but she can easily miss, consequently cut that piece by some angle.
    I've calculated by the knowledge of Math the area of the equidistant trapezoid, which depends on the angle, you've entered, the length of the square int the base and the height of such a parallelepiped.
 */
public class CheeseForAnfissa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Length, Height, degrees;
        double radians;
        int accuracy = 3;
        double Area = 0.0;
        Length = scanner.nextInt();
        Height = scanner.nextInt();
        do{
            degrees = scanner.nextInt();
        } while(degrees < 0 || degrees > 90);
        degrees = 90 - degrees;
        radians = Math.toRadians(degrees);
        if(radians < Math.atan(Height*Math.sqrt(2)/Length) && radians >= 0){
            Area = ((Length*(Length*Math.sqrt(2) - 2*Height*Math.tan(radians)))/2)*(Height / Math.cos(radians));
        } else if(degrees == Math.atan(Height*Math.sqrt(2)/Length)) {
            Area = (Height*Length*Math.sqrt(2))/(2*Math.sin(Math.atan(Height*Math.sqrt(2)/Length)));
        }
        System.out.printf("%." + accuracy + "f", Area );
    }
}