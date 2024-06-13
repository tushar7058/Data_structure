package Recurssion;

public class noPrint {
    public static void printreucrsive(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printreucrsive(n+1);
    }
    public static void main(String[] args) {
        // print no from 5 to 1
        int n =1;
        printreucrsive(n);
    }
} 
