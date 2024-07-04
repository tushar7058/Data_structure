// count total oaths in a maze to move from(0,0) to (n,m)
public class ProbTwo {
    public static int countpaths(int i,int j,int m, int n){
            if (i==n || j==m) {
                return 0;
            }
            if (i==n-1 && j==m-1) {
                return 1;
            }
            // move Downwards
            int downpaths = countpaths(i+1, j, m, n);
            // move rightwards
            int rightpaths = countpaths(i, j+1, m, n);
            // return the sum of downpaths and rightpaths
            return downpaths + rightpaths;
        } 
        public static void main(String[] args) {
         int n = 3 , m = 3;
        int totalpaths  =  countpaths(0, 0, m, n);
        System.out.println(totalpaths );
    }
}











