import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args)
    {
        //Create variables
        double loan = 0, monthly = 0;
        int years = 0, numPayments = 0;


        //Create scanner object for user input
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Loan Amount: ");
        loan = input.nextDouble();
        System.out.print("Number of Years: ");
        years = input.nextInt();

        //Calculate monthly payment
        monthly = (0.05/12) * loan;

        //Calculate the number of payments made


        //Create equation to calculate Total Accrued Amount (TAA)
        double taa =  monthly * numPayments;

        //Output the total payment
        System.out.println("Total Payment: " );

    }
}
