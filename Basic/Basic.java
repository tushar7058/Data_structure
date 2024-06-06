//package Basic;
// java basics  operator and binary number system
public class Basic {
    public static void main(String[] args) {
        // post increment 
        int a = 10 ;
        int b  = 0;

        b = a++;
        System.err.println(a);
        System.err.println(b );

        // preincrement
        int c = 10;
        int d  = 0;

        d = ++c;
        System.err.println(c);
        System.err.println(d);


        // relational operator

        // 1. equal to 
         int tony = 22;
         int spidy =21;
         System.out.println(tony==spidy);

         //logical oprator
             int t = 3;
             int s =3;
             if(t==s && s!=t){
                System.err.println(true);
             }else{
                System.out.println(false);
             }

             // Bitwise operator 
             int adam = 0101;
             int serrra = 0110;
             System.out.println(adam&serrra); //binary and
             System.out.println(adam|serrra); // binary or
     }
}
