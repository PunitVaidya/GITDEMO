//Q3. Check whether two integers are equal or not

import java.util.*;
public class Prg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b)
            System.out.println("Both numbers are equal");
        else
            System.out.println("Numbers are not equal");
    }
}