import java.util.Scanner;

public class Fibonacci {
    static int num;

    static int fibonacciSeq(int number) {
        if (number == 1 || number == 2)
            return 1;

        return fibonacciSeq(number-1) + fibonacciSeq(number-2);
    }

    public static void main(String[] args) {
        do {
            System.out.print("Enter the number of Fibonacci terms you wish to print: ");

            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if (num < 0)
                System.out.println("Illegal!");

            else if (num == 0)
                System.out.println("Okay, let's try again next time.");
        } while(num < 0);

        if(num > 0) {
            System.out.println("The fibonacci sequence up to number " + num + " is: ");
            for (int i = 1; i <= num; i++) {
                System.out.print(fibonacciSeq(i) + " " + "\n");
            }
        }
    }
}