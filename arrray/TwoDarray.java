import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int num [][]= new int[rows][columns];
         // input 
         for(int i= 0;i<rows;i++){
            // output
            for(int j =-0;j<columns;j++){
                num[i][j]= sc.nextInt();
            }
         }

         // Searching for an element x in a matrix.
             int x = sc.nextInt();

             for(int i =0;i<rows;i++){
                for(int j = 0;j<columns;j++){
                    if(num[i][j]==x){
                        System.out.println("x  is found at location("+i+","+j+")");
                    }
                }
             }



        //  // output 
        //  for(int i =0;i<rows;i++){
        //     for(int j =0;j<columns;j++){
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        //  }
    }
}
