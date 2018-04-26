// Question - https://leetcode.com/problems/judge-route-circle/description/

import java.util.Scanner;

public class JudgeRouteCircle {

    public static boolean isRouteCircle(String str) {
        boolean result=false;
        int[] direction = new int[4];

        for(int i=0; i <= str.length()-1; i++){
            if(str.charAt(i) == 'U')
                direction[0]++;

            else if(str.charAt(i) == 'D')
                direction[1]++;

            else if(str.charAt(i) == 'L')
                direction[2]++;

            else
                direction[3]++;
        }

        if(direction[0] == direction[1] && direction[2]==direction[3])
            result = true;

        return result;
    }

    public static void main(String[] args) {
        String str = new String();
        System.out.println("Enter the String for Move Sequence:");

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        boolean result = isRouteCircle(str);
        System.out.println(result);
    }
}
