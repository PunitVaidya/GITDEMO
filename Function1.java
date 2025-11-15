//Q1. Write a java program to print all natural numbers from 1 to n. using fuction

import java.util.*;
public class Function1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int res[] = new int[n];
        res = getNum(res, n);

        for (int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
    public static int[] getNum(int arr[], int num) {
        int a[] = new int[num];
        for (int i=0; i<num; i++){
            a[i] = i + 1;
        }
        return a;
    }
}