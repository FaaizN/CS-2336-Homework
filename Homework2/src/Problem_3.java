import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args)
    {
        //Create the variables needed for this program
        String userName;
        double hours, payRate, fedTax,
               stateTax, grossPay, netPay;

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
    }
}
