package basic;
import java.util.Scanner;


public class  sipcalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly investment: ");
        double monthlyInvestment = input.nextDouble();

        System.out.print("Enter expected returns in percentage: ");
        double expectedReturnsInPer = input.nextDouble();

        System.out.print("Enter period in years: ");
        int periodInYears = input.nextInt();

        double principleAmount = monthlyInvestment * 12 * periodInYears;

        double estimatedReturns = (principleAmount * expectedReturnsInPer) / 100;

        double totalAmount = principleAmount + estimatedReturns;

        System.out.println("Principle Amount: " + principleAmount);
        System.out.println("Estimated Returns: " + estimatedReturns);
        System.out.println("Total Amount: " + totalAmount);

        input.close();
    }
}



