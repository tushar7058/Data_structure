// package Recurssion.9 Best Problems;

import java.util.Scanner;

public class FirstProb {
    public static void towerofhanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " +  src +  " to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from" +  src  + " to " + dest);

        towerofhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        towerofhanoi(n, "S", "H", "D");
        
    }
}
