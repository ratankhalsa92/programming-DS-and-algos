import java.util.*;

public class ReverseWords {

    public static String reverseWord(String str){
        String splitString[] = str.split(" ");
        StringBuffer sbf = new StringBuffer();
        
        for(int i=0; i<splitString.length; i++) {
            for(int j=splitString[i].length()-1; j>=0; j--) {
                sbf.append(splitString[i].charAt(j));
            }
            sbf.append(" ");
        }

        return sbf.substring(0, sbf.length()-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a String who's words you wish to reverse: ");

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        String result = reverseWord(str1);
        System.out.println(result);
    }
}