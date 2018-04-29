// Question: https://leetcode.com/problems/detect-capital/description/

import java.util.*;

public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
        boolean res = false;

        if(word.length() == 1)
            res = true;

        else {
            if (word == word.toUpperCase())
                res = true;

            else if (word == word.toLowerCase())
                res = true;

            else {
                char[] array1 = word.toCharArray();

                if (Character.isUpperCase(array1[0]))
                    res = true;

                for (int i = 1; i < word.length(); i++) {
                    if (Character.isUpperCase(array1[i])) {
                        res = false;
                        return res;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.print("Enter a String: ");

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();


        boolean result = detectCapitalUse(str1);
        System.out.println(result);
    }
}
