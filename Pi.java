import java.math.BigDecimal;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigDecimal a = new BigDecimal(22.0);
        BigDecimal b= new BigDecimal(7.0);

        System.out.println("Please specify the number of decimal places you want to print Pi.");

        int n = input.nextInt();

        if(n < 32627)
            System.out.println(a.divide(b, n, BigDecimal.ROUND_UP));
        else
            System.out.println("Limit exceeded !!!");
    }
}
