// print all the subsequence of a string
public class seventhProb {
    public static void subsequences(String str, int index,String NewStirng){
        if (index == str.length()) {
            System.out.println(NewStirng);
            return;
        }
        char currChar = str.charAt(index);
         // choices to be 
         subsequences(str, index+1, NewStirng+currChar);
         // not to be
         subsequences(str, index+1, NewStirng);
    }
    public static void main(String[] args) {
        String str = "aaa";
        subsequences(str, 0, "");
    }
}
