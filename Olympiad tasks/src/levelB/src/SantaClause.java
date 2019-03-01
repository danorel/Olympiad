package src;

import java.util.Scanner;
import java.util.Arrays;

public class SantaClause {
    public static void main(String[] aaa){
        Scanner sc = new Scanner(System.in);
        int NumberOfGifts = sc.nextInt();
        int[][] PackAnd = new int[NumberOfGifts][2];
        for ( int counter = 0; counter < NumberOfGifts * 2; counter++) PackAnd[counter%NumberOfGifts][counter/NumberOfGifts] = sc.nextInt();
        Arrays.sort(PackAnd,(int[] p1, int[] p2) -> Math.min(p1[0], p2[1]) - Math.min(p2[0], p1[1]));
        int result = 0, a = 0 ;
        for (int[] p:PackAnd){
            a += p[0];
            result = Math.max(result, a) + p[1];
        }
        System.out.println(result);
    }
}