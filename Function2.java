//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class Function2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        getNum(n);
    }
    public static void getNum(int num) {
        /*int i = num;
        while(i>0) {
            System.out.println(i);
            i--;
        }*/
		for(int i=num;i>0;i--){
			System.out.println(i);
		}
    }
}