import java.util.Scanner;

public class HW_3_Problem_3 {

    public static int[] eliminateDuplicates(int[] list)
    {
        //Create variables
        int[] temp = new int[list.length];
        int tempIndex = 0;
        boolean isDuplicate = false;

        //Iterate through first and temp array and if index values == then set bool isDuplicate to true;
        for (int i = 0; i < list.length; i++)
        {

            for (int k = 0; k < list.length; k++)
            {
                if (temp[k] == list[i])
                {
                    isDuplicate = true;
                }
            }

            //If isDuplicate is false, set and increment tempIndex for temporary array = to current list index value
            if (!isDuplicate)
            {
                temp[tempIndex++] = list[i];
            }
        }

        //Create a trimmed array that holds all the values of the parameter array without duplicates
        int[] trimmedArray = new int[tempIndex];

        for (int i = 0; i < tempIndex; i++)
        {
            trimmedArray[i] = temp[i];
        }

        return trimmedArray;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] numList = new int[10];

        //Ask user for input and store input into array
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = input.nextInt();
        }

        //Call function
        numList = eliminateDuplicates(numList);

        //Display the new array
        System.out.print("The distinct numbers are: ");
        for(int i = 0; i < numList.length; i++)
        {
            System.out.print(numList[i] + " ");
        }
    }
}
