package Strings;
import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
     
        // Scanner sc =new Scanner(System.in);

        // String name = sc.nextLine();
        // System.out.println("Your name is :"+name);
     
        // sring declaraion

        String name1 = "Tushar";
        String buddy = "Me";

        // concatenation
        String name2 = "Tushar";
        String buddy2 = "Me";
        
        String fullname = name2+buddy2;
        System.out.println("concatenation:"+fullname);
        System.out.println("length of char:"+fullname.length());

        //charat
        for(int i =0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        // compare 
        String t = "Tony";
        String z = "zebra";

        if(t.compareTo(z) == 0){
        System.out.println("strings are equal ");            
        }else{
            System.out.println("String are not equal");
        }
        // substrig
        String sentence = "X is My Randi";
        String name = sentence.substring(8,sentence.length());
        System.out.println(name);
        
        // Strings are immutable mens not changable 
    }
}