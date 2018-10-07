// Cost of Tile to Cover W x H Floor
// Calculate the total cost of tile it would take to cover a floor plan of width and height,
// using a cost entered by the user.

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

        System.out.println("Cost of tiling: $" + w*h*cost);
    }
}
