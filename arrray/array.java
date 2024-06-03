import java.util.Scanner;

//import Strings.sting;

/**
 * arary
 */
public class array {
    public static void main(String[] args) {
        // int marks[] = new int[3]; // creating object of marks
        // marks[0] = 23; 
        // marks[1] = 45;
        // marks[2] = 45;

     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int num []= new int[size];

     // input
     for(int i = 0;i<size;i++){
        num[i]= sc.nextInt();
     
     for (int j = 0; j < size; j++) {
            System.out.println(num[j]);
        }
    }
}
}
