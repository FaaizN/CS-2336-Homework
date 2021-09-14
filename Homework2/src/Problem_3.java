import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args)
    {
        //Create the variables needed for this program
        String userName;
        double hours, payRate, fedTax,
               stateTax, grossPay, netPay,
               fedHolding, stateHolding, totalDeduct;

        //Create a scanner object to read in user input;
        Scanner input = new Scanner(System.in);

        //Prompt user for input and store in variables
        System.out.print("Enter employee's name: ");
        userName = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate: ");
        fedTax = input.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        stateTax = input.nextDouble();

        //Calculate the Gross pay
        grossPay = hours * payRate;

        //Calculate the federal withholding
        fedHolding = grossPay * fedTax;

        //Calculate the state withholding
        stateHolding = grossPay * stateTax;

        //Calculate the Total Deduction
        totalDeduct = fedHolding + stateHolding;

        //Calculate the netPay
        netPay = grossPay - totalDeduct;

        //Output the solution
        System.out.println("Employee Name: " + userName);
        System.out.printf("Hours Worked: %.2f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.println();


    }
}
