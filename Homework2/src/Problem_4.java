import java.util.Scanner;

public class Problem_4 {

    public static void main(String[] args)
    {
        //Create variables
        double loan = 0, monthlyPayment,
               interest = 5.00, totalPayment;
        int years = 0;

        //Create scanner object for user input
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Loan Amount: ");
        loan = input.nextDouble();
        System.out.print("Number of Years: ");
        years = input.nextInt();
        System.out.println();


        System.out.println("Interest Rate\tMonthly Payment\t\tTotal Payment\n");

        while(interest <= 8.00)
        {
            //Calculate monthly interestRate
            double monthInterest = interest/1200;

            //Calculate Payment
            monthlyPayment = loan * monthInterest / (1-1 / Math.pow(1 + monthInterest, years * 12));
            totalPayment = monthlyPayment * years * 12;

            System.out.printf("%.3f%%\t\t\t%.2f\t\t\t\t%.2f\n", interest, monthlyPayment, totalPayment);

            interest += .125;
        }
    }
}
