// Question - https://leetcode.com/problems/reverse-string/

import java.util.*;

public class ReverseString {

    public static String reverseString(String str1) {
        StringBuffer sbf = new StringBuffer();

        for(int i=str1.length()-1; i>=0; i--) {
            sbf.append(str1.charAt(i));
        }

        return sbf.toString();

    }

    public static void main(String[] args) {

        System.out.print("Enter a String:");

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        String result = reverseString(str1);
        System.out.println(result);
    }
}
