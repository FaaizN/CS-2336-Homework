import java.util.Scanner;

public class Problem_2 {

    public static boolean checkSSN(String SSN, boolean check)
    {

        return check;
    }

    public static void main(String[] args)
    {
        //Create String to store SSN
        String SSN = null;

        //Create boolean to determine if String is SSN (TRUE) or not (FALSE)
        boolean check = true;

        //Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Prompt the user for input and store input into String object "SSN" using Scanner object "input"
        System.out.println("Enter a SSN: ");
        SSN = input.nextLine();

        //Call the checkSSN function
        check = checkSSN(SSN, check);

        if(check == true)
        {
            System.out.println(SSN + " is a valid social security number");
        }
        else
        {
            System.out.println(SSN + " is an invalid social security number");
        }
    }
}
