// package Recurssion.Recurssion3 ;

// print all permutations of  a string
public class probOne {
    public static void printpermutation(String str,String permutation){
        if (str.length()==0) {
            System.out.println(permutation);
        }

        for(int i = 0;i<str.length();i++){
            char currChar = str.charAt(i);
            // "abc "--> ""ab
            String newsStr = str.substring(0, i)+str.substring(i+1);
             
            printpermutation(newsStr, permutation+currChar);
    
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printpermutation(str, "");
    }
}
