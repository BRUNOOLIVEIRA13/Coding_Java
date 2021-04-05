package HackerRank.exercicios.intro;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @Author:Bruno
 * outputs the area of a parallelogram with breadth B and height H.
 * You should read the variables from the standard input.
 * IF B ou H <= 0, the output should be
 * "java.lang.Exception: Breadth and height must be positive"
 */

public class InitializerBlock {

    private static final Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = parallelogramConditions();

    private static boolean parallelogramConditions () {
        if (B <= 0 || H <=0 ) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
