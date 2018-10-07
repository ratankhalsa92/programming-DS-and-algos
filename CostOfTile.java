import java.util.*;

public class CostOfTile {

    public static void main(String[] args) {
        double w, h;
        double cost;
        double ans;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Width & Height (in meters): ");
        w = sc.nextDouble();
        h = sc.nextDouble();

        System.out.print("Enter cost in USD per sq. m: ");
        cost = sc.nextDouble();

//        ans = ;
        System.out.println("Cost of tiling: $" + w*h*cost);
    }
}
