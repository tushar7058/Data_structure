//import java.net.FileNameMap;
import java.util.ArrayList;
// print all the subset of a set of first n natural number
public  class ProbFive {
   public  static void  printsubset(ArrayList<Integer>subset){
       for(int i=-0;i<subset.size();i++){
           System.out.print(subset.get(i)+" "); // print all subset element
       }
       System.out.println();
   }
    //base case
    public  static  void FindSubset(int n, ArrayList<Integer>subset){
        //base case
        if (n==0){
            printsubset(subset);
            return;
        }
        // add hoga
        subset.add(n);
        FindSubset(n-1,subset);
        // add nhi hoga
        subset.remove(subset.size()-1);
        FindSubset(n-1,subset);
    }
    public static void main(String[] args) {
       int n =3;
       ArrayList<Integer>subset = new ArrayList<>();
       FindSubset(n,subset);
    }
}