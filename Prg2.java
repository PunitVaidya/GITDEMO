//Q2. Check voting eligibility (age ≥ 18)

import java.util.*;
public class Prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}