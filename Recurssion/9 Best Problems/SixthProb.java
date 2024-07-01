//Remove Duplicates in a string
public class SixthProb {
    public static boolean[]map = new boolean [26]; // creating object 
    public static void removeduplicates(String str,int idx,String newsString){
        if (idx==str.length()) {
            System.out.println(newsString);
            return;
        }
        char Currchar = str.charAt(idx);
        if (map[Currchar-'a']==true) { // map fun used to check currchar k
            removeduplicates(str, idx+1, newsString);
        }else{
            newsString+=Currchar;
            map[Currchar-'a']=true;
            removeduplicates(str, idx+1, newsString);
        }
    }  
    public static void main(String[] args) {
        String str = "abbccda";
        removeduplicates(str, 0, "");
    }   
}
