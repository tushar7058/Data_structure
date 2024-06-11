package Strings;
import java.util.*;
public class StringBuilder1 {
    public static void main(String[] args) {
        // declatration 
        StringBuilder name = new StringBuilder("Apna College"); // object 
        System.out.println(name);

        // char at 0 index
        System.out.println(name.charAt(0));

        // set char index
        name.setCharAt(0, 'p');
        System.out.println(name);

        // insert char at index
        name.insert(0,'s');
        System.out.println(name);

        // delete string 
        name.delete(1, 2);
        System.out.println(name);


        // apppend in stringbuilder
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());// length method


        // reverse string with string builder

        StringBuilder str = new StringBuilder("hello");

        for(int i =0 ;i<str.length()/2;i++){
            int front = i;
            int back  = str.length()-1-i; //5-1-0=>4

            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);
        }
        System.out.println("reverse string is:"+str);
        System.out.println("Hello world");
    }
}
