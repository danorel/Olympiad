import java.util.Scanner;
/*
    What quarter is the point is?
    1 - if in the 1-st quarter.
    2 - if in the 2-nd quarter.
    3 - if in the 3-rd quarter.
    4 - if in the 4-rth quarter.
    0 - if in none quarter.
 */
public class WhatQuarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double X, Y;
        do{
            X = scanner.nextDouble();
        } while(Math.abs(X) > 100);
        do{
            Y = scanner.nextDouble();
        } while(Math.abs(Y) > 100);
        if(X > 0 && Y > 0){
            System.out.println("1");
        }
        if(X < 0 && Y > 0){
            System.out.println("2");
        }
        if(X < 0 && Y < 0){
            System.out.println("3");
        }
        if(X > 0 && Y < 0){
            System.out.println("4");
        }
        if((X == 0 && Y != 0) || (Y == 0 && X != 0) || (X == 0 && Y == 0)){
            System.out.println("0");
        }
    }
}
