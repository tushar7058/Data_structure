// package Recurssion.9 Best Problems;

public class secondProb {
    public static void ReverString(String str,int index) {
        if (index==0) {
        System.out.print(str.charAt(index));
        return;
        }
        System.out.print(str.charAt(index));
        ReverString(str, index-1);
    }
    public static void main(String[] args) {
        String str= "ABCD";
        ReverString(str, str.length()-1);
    }
}
