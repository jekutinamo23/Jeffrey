import java.util.Scanner;

public class ATM {
    /**
     * prints the amount to dispense in twenties, tens, fives,
     * ones, quarters, dimes, nickels, and pennies.
     *
     */
    public static void dispense(double amount)
    {

        int twenties = (int)amount / 20;
        double remainder = amount%20;
        int tens = (int)remainder/10;
        remainder = remainder%10;
        int fives = (int)remainder/5;
        remainder = remainder%5;
        int ones = (int) remainder;
        remainder = remainder%1;
        int quarters = (int)(remainder/.25);
        remainder = remainder%.25;
        int dimes = (int)(remainder/.10);
        remainder = remainder%.10;
        int nickels = (int)(remainder/.05);
        remainder = remainder%.05;
        int pennies = (int)((remainder/.01)+.01);
        remainder = remainder%.01;


        System.out.println(amount+" contains:");
        System.out.println(twenties+" in $20");
        System.out.println(tens+" in $10");
        System.out.println(fives+" in $5");
        System.out.println(ones+" in $1");
        System.out.println(quarters+" in 25¢");
        System.out.println(dimes+" in 10¢");
        System.out.println(nickels+" in 5¢");
        System.out.println(pennies+" in 1¢");



    }
    // DO NOT TOUCH THE CODE BELOW THIS LINE
    public static void main(String[] arg) {
        Scanner scn = new Scanner(System.in);
        double amount = scn.nextDouble();
        dispense(amount);
    }
}
