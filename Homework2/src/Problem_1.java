import java.util.Scanner;

public class Problem_1 {

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

        //Check user input for month
        if(month.length() > 3)
        {
            System.out.println("Incorrect input. Please only enter the first 3 letters of the month with the" +
                    " first one in uppercase");
        }
        else
        {
            if(Character.isUpperCase(month.charAt(0)) == false)
            {
                System.out.println("Incorrect input. Please only enter the first 3 letters of the month with the" +
                        " first one in uppercase");
            }
            else
            {
                //This switch statement assigns numDays the number of days in a month depending on the Month the user entered
                switch(month)
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
                //Output the solution
                System.out.println(month + " " + year + " has " + numDays + " days");
            }
        }

    }
}
