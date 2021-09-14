import java.util.Scanner;

public class Problem_2 {

    public static void main(String[] args)
    {
        //Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        //Prompt the user for input and store input into String object "SSN" using Scanner object "input"
        System.out.print("Enter a SSN: ");
        String SSN = input.nextLine();

        //Check if the SSN is valid
        if(SSN.length() == 11)
        {
            if(SSN.charAt(3) != '-' && SSN.charAt(6) != '-')
            {
                System.out.println(SSN + " is an invalid social security number");
            }
            else
            {
                //Check if all other character index are digits or not
                if(Character.isDigit(SSN.charAt(0)) && Character.isDigit(SSN.charAt(1)) &&Character.isDigit(SSN.charAt(2))
                        && Character.isDigit(SSN.charAt(4)) && Character.isDigit(SSN.charAt(5)) &&
                        Character.isDigit(SSN.charAt(7)) && Character.isDigit(SSN.charAt(8)) &&
                        Character.isDigit(SSN.charAt(9)) && Character.isDigit(SSN.charAt(10)))
                {
                    System.out.println(SSN + " is a valid social security number");
                }
                else
                {
                    System.out.println(SSN + " is an invalid social security number");
                }
            }
        }
        else
        {
            System.out.println(SSN + " is an invalid social security number");
        }
    }
}
