import java.util.Scanner;

public class Problem_1 {

    //This function assigns the days of the month to an int depending on the
    //user input
    public static int Count(String input, int year, int numDays)
    {
        //This switch statement assigns numDays the number of days in a month depending on the Month the user entered
        switch(input)
        {
            case "Jan":
                numDays = 31;
                break;
            case "Feb":
                //If the year is divisible by 4 then numDays is 29 because of leap year
                if (year % 4 == 0)
                    numDays = 29;
                else
                    numDays = 28;
                break;
            case "Mar":
                numDays = 31;
                break;
            case "Apr":
                numDays = 30;
                break;
            case "May":
                numDays = 31;
                break;
            case "Jun":
                numDays = 30;
                break;
            case "Jul":
                numDays = 31;
                break;
            case "Aug":
                numDays = 31;
                break;
            case "Sep":
                numDays = 30;
                break;
            case "Oct":
                numDays = 31;
                break;
            case "Nov":
                numDays = 30;
                break;
            case "Dec":
                numDays = 31;
                break;
        }

        return numDays;
    }

    //Display the output to the console
    public static void output(int numDays, String month, int year)
    {
        System.out.println(month + " " + year + " has " + numDays + " days");
    }

    public static void main(String[] args)
    {
        //Declare variables
        int year = 0, numDays = 0; String month = null;

        //Create Scanner objects for year and month
        Scanner userYear = new Scanner(System.in);
        Scanner userMonth = new Scanner(System.in);

        //Ask for user input for the year and store input
        System.out.print("Enter a year: ");
        year = userYear.nextInt();

        //Ask for user input for the month and store input
        System.out.print("Enter a month: ");
        month = userMonth.nextLine();

        //Call the Count function
        numDays = Count(month, year, numDays);

        //Call the output function
        output(numDays, month, year);
    }
}
