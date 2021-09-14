import java.util.Scanner;

public class Problem_2 {

    public static boolean checkSSN(char[] SSN, boolean check)
    {
        //Check if the string is in the proper format for a SSN
        if(SSN.length == 11)
        {
            //Check if the chracter has hyphens in the proper place
            if(Character.isDigit(SSN[3]) && Character.isDigit(SSN[6]))
            {
                check = false;
            }
            else //Hyphens in proper place and the SSN is valid
            {
                check = true;
            }
        }
        else //SSN was not the proper length
        {
            check = false;
        }
        return check;
    }

    public static void main(String[] args)
    {
        //Create boolean to determine if String is SSN (TRUE) or not (FALSE)
        boolean isSSN = true;

        //Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Prompt the user for input and store input into String object "SSN" using Scanner object "input"
        System.out.print("Enter a SSN: ");
        char[] SSN = input.next().toCharArray();

        //Call the check SSN function
        isSSN = checkSSN(SSN, isSSN);

        //If SSN is true, output that the SSN is valid, else output that SSN is invalid
        if(isSSN == true)
        {
            for(int i = 0; i < SSN.length; i++)
            {
                System.out.print(SSN[i]);
            }

            System.out.println(" is a valid social security number");
        }
        else
        {
            for(int i = 0; i < SSN.length; i++)
            {
                System.out.print(SSN[i]);
            }

            System.out.println(" is an invalid social security number");
        }
    }
}
