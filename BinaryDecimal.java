// Binary to Decimal and Back Converter
// Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.
import java.util.*;
import java.lang.Math;

public class BinaryDecimal {

    public static void decimalToBinary(int num) {
        int[] arr = new int[12];
        int i = 0;


        while(num > 1){
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }
        arr[i] = num;

        System.out.print("This number in Binary is: ");
        for(int j = i; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }

    public static void binaryToDecimal(int num) {
        int[] arr = new int[12];
        int i = 0;
        int result = 0;
        int rem;

        while(num != 0) {
            rem = num  % 10;
            num = num / 10;
            if(rem == 1)
                result = result + (int) Math.pow(2, i);
            i++;
        }
        System.out.println("This number in Decimal is: " + result);
    }

    public static void main(String[] args) {
        int decimal_num;
        int binary_num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number ( <= 4096): ");
        decimal_num = sc.nextInt();

        decimalToBinary(decimal_num);
        System.out.println("\n");

        System.out.print("Enter a Binary number: ");
        binary_num = sc.nextInt();

        binaryToDecimal(binary_num);
    }
}
