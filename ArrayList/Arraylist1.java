// package ArrayList;
import java.util.*;

public class Arraylist1 {
    public static void main(String[] args) {
        // integer list
        ArrayList<Integer>list  =  new ArrayList<Integer>();
        // String 
      //  ArrayList<Boolean>list2 = new ArrayList<>();

      // 1 ope : Add elements
      list.add(0);
      list.add(2);
      System.out.println(list);

      // 2nd ope : Get element
     int ele =  list.get(0);
     System.out.println("get elements is :" + ele);

     // to add ele between
     list.add(1,1);
     System.out.println(list);

     // set element means change alredy placed element
     list.set(0, 10);
     System.out.println(list);

     // delete element
     list.remove(0);
     System.out.println(list);
    
     // arrralist size 
     int size_of_List = list.size();
     System.out.println(size_of_List);

     //loops
     for(int i=0;i<list.size();i++){
        System.out.print(list.get(i));
     }
     System.out.println();
    }

    // // sorting 
    // List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9, 2));
    
    // // Sort the list using Collections.sort
    // Collections.sort(numbers);
    
    // // Print the sorted list
    // System.out.println("Sorted list of numbers: " + numbers);

}


