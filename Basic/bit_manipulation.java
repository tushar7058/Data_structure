import java.util.Scanner;

public class bit_manipulation {
   public static void main(String[] args) {
      // Get Bit in Bitmanipulation
      // steps : 1. 1<<i 2. operation = & and

      // int n= 5;
      // int pos = 2;
      // int bitmask = 1<<pos;

      // if((bitmask & n)== 0 ){
      // System.out.println("bit was zero");
      // }
      // else{
      // System.out.println("bit was one ");
      // }

      // set Bit in Bitmanipulation
      // steps : 1. 1<<i 2. operation = | or
      // int n= 5;
      // int pos = 1;
      // int bitmask = 1<<pos;

      // int newnum = bitmask|n;
      // System.out.println(newnum);

      // clear bit in bitmanipulaton
      // steps : 1. 1<<i 2. operation = AND with Not
      // int n= 5;
      // int pos = 2;
      // int bitmask = 1<<pos;
      // int notbitmask = ~(bitmask);

      // int newnum = notbitmask & n;
      // System.out.println(newnum);

      // Update Bit

      Scanner sc = new Scanner(System.in);
      int oper = sc.nextInt();
      // oper=1 -> set; oper=0 -> clear
      int n = 5;
      int pos = 1;

      int bitMask = 1 << pos;
      if (oper == 1) {
         // set
         int newNumber = bitMask | n;
         System.out.println(newNumber);
      } else {
         // clear
         int newBitMask = ~(bitMask);
         int newNumber = newBitMask & n;
         System.out.println(newNumber);
      }

   }
}
