package BackTracking;

public class ProbOne {

    public static void printPermutation(String str, String perm, int idx) {
        // Base condition: if str is empty, print the permutation
        if (str.isEmpty()) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newstr, perm + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str, "", 0);
    }
}