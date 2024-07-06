// find the number of ways  in which you can invite n people to your party , single or pairs
public  class ProbFour {
    public  static  int callguest(int n){
        if (n<=1){
            return  1;
        }
        // single
        int waysone = callguest(n-1);
        // pair
        int waystwo = (n-1)*callguest(n-2);

        return  waysone+waystwo;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callguest(n));
    }
}