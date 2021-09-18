import java.util.Scanner;

public class Problem_5 {

    public static void main(String[] args)
    {
        //Create variables
        double loan, interestRate, monthlyPayment = 0, totalPayment = 0,
                principal = 0,balance = 0;
        int years, counter = 1;

        //Create scanner object for user input
        Scanner input = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Loan Amount: ");
        loan = input.nextDouble();
        System.out.print("Number of Years: ");
        years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        interestRate = input.nextDouble();
        System.out.println();

        //Calculate the Monthly Interest
        double monthInterestRate = interestRate/1200;

        //Calculate Monthly payment
        monthlyPayment = loan * monthInterestRate / (1-1 / Math.pow(1 + monthInterestRate, years * 12));

        //Calculate Total Payment
        totalPayment = monthlyPayment * years * 12;

        //Output monthly and total payment
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);

        System.out.println("Payment#\tInterest\t\tPrincipal\t\t\tBalance");

        balance = loan;
        double interest;
        //Create Amortization Schedule
        while(counter <= years * 12)
        {
            interest = monthInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%d\t\t\t%.2f\t\t\t%.2f\t\t\t\t%.2f\n", counter, interest, principal,balance);
            counter++;
        }
    }
}
