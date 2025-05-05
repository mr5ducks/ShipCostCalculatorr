import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //variables
        final double freeShip = 100.0;
        final double noFree = 0.02;
        double price = 0;
        double shipCost = 0;
        //code
        System.out.println("please put the price of your thing here!");
        price = in.nextDouble();
        if (price >= freeShip) {    // start of the if statement
            shipCost = 0.0;
        } else {
            shipCost = price * noFree;
        } //end of if and else
        //where everythign is printed
        System.out.println("Price: $" + price);
        System.out.println("Shipping: $" + shipCost);
        System.out.println("Total: $" + (price + shipCost));
        in.close();
    }
}