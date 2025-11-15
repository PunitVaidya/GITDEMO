//Q1. Maximum between three numbers

import java.util.*;
public class Prg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
            System.out.println("Maximum = " + a);
        else if(b>=c)
            System.out.println("Maximum = " + b);
        else
            System.out.println("Maximum = " + c);
    }
}