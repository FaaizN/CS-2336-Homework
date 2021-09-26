import java.util.Scanner;

public class HW_3_Problem_3 {

    public static int[] eliminateDuplicates(int[] list)
    {
        //Create variables
        int arrayLength = list.length;
        int[] temp = new int[arrayLength];
        int tempIndex = 0;
        boolean flag[] = new boolean[list.length];

        //Set the flag for duplicate at every index to false
        for (int i = 0; i < list.length; i++)
        {
            flag[i] = false;
        }

        //Iterate through the list and temp list to determine if there is a duplicate, if so set boolean flag to true
        for(int i = 0; i < list.length; i++)
        {
            for(tempIndex = 0; tempIndex < i; tempIndex++)
            {
                if(list[i] == list[tempIndex])
                {
                    flag[i] = true;
                    arrayLength--;
                    break;
                }
            }
        }

        //Create array without duplicates
        for (int i = 0; i < list.length; i++)
        {
            if(flag[i] == false)
            {
                temp[tempIndex++] = list[i];
            }
        }
        return temp;
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

        int [] distinctNum = eliminateDuplicates(numList);

        //Display the new array
        System.out.print("The distinct numbers are: ");
        for(int i : distinctNum)
        {
            if(i > 0)
                System.out.print(i + " ");
        }
    }
}
