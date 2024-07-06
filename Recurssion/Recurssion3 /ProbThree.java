import java.text.BreakIterator;

// place tiles of size 1xm in a floor of size nxm
public class ProbThree {
    public static  int  Placetiles(int n, int m) {
        // base case
        if (n==m){
            return  2;
        }
        if (n<m){
            return 1;
        }
        // vertical
        int vertiplacement = Placetiles(n-m,m);
        //horizontal
        int horizontal = Placetiles(n-1,m);
        return  vertiplacement+horizontal;
    }
    public static void main(String[] args) {
         int n = 4,m = 4;
        System.out.println(Placetiles(n,m));
    }
}
