import java.util.Scanner;

public class DemoCartons {
    public static void main(String [] args) {

        //create input object
        Scanner inputScan = new Scanner(System.in);

        //declare variables
        double quantity, costPerLiter, costTotal, profit;
        int cartons;

        //define constants
        final double CARTON_CAPACITY = 1.89;
        final double RETAIL_PRICE = 2.99;

        //input
        System.out.print("Enter, in liters, the quantity of orange juice produced: ");
        quantity = inputScan.nextDouble();

        System.out.print("Enter the cost of producing one liter orange juice: ");
        costPerLiter = inputScan.nextDouble();

        //calculate
        cartons = (int)(quantity / CARTON_CAPACITY);
        costTotal = quantity * costPerLiter;
        profit = RETAIL_PRICE * cartons - costTotal;

        //print
        System.out.println("\n Quantity in Liters: " + quantity);
        System.out.println("Cartons Needed: " + cartons);
        System.out.printf("Cost of Production: $%.2f %n", costTotal);
        System.out.printf("Total Profit: $%.2f %n", profit);
    }
}
