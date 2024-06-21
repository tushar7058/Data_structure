// Move all "X" to the end of String.

public class fifithProb {
    public static void Movex(String str, int idx, int count, String NewString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                NewString += 'x';
            }
            System.out.println(NewString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            Movex(str, idx + 1, count, NewString);
        } else {
            NewString += currChar; // NewStirng = NewStirng + currChar
            Movex(str, idx + 1, count, NewString);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxcd";
        Movex(str, 0, 0, "");
    }
}
