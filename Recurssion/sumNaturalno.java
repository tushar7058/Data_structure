package Recurssion;
public class sumNaturalno {
    public static void Naturalsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Naturalsum(i+1, n, sum);
        System.out.println(i);// i values
    }
    public static void main(String[] args) {
        int n =1;
        Naturalsum(1,5,0);
    }
} 
