import java.util.HashSet;

public class eightprob {
    public static void unique(String str, int index, String newString, HashSet<String> set) {
        if (index == str.length()) {
            // Base case: print only if it's not empty and unique
            if (!newString.isEmpty() && !set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        
        char currChar = str.charAt(index);
        // Include the current character
        unique(str, index + 1, newString + currChar, set);
        // Exclude the current character
        unique(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa ";
        HashSet<String> set = new HashSet<>();
        unique(str, 0, "", set);
    }
}