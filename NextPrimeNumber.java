// Next Prime Number
// Have the program find prime numbers until the user chooses to stop asking for the next one.

import java.util.*;

public class NextPrimeNumber {

    public static boolean isPrime(int n) {
        if (n == 2)
            return true;

        for(int i=2; i <= n/2; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static int generatePrime(int currentPrime) {         // Returns the next prime after the current one
        int newPrime = currentPrime + 1;

        while(true) {
            if(!isPrime(newPrime))
                newPrime += 1;
            else
                break;
        }
        return newPrime;
    }

    public static void main(String[] args) {
        int currentPrime = 2;
        String answer;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Would you like to see the next Prime? (Y/N): ");
            answer = sc.nextLine();

            if(answer.toLowerCase().equals("y")) {
                System.out.println(currentPrime + "\n");
                currentPrime = generatePrime(currentPrime);
            }
            else
                break;
        }
    }
}