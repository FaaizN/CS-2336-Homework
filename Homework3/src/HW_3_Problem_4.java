import java.util.Scanner;

public class HW_3_Problem_4 {

    public static boolean isSorted(int[] list)
    {
        boolean isSorted = true;

        //Go through list and if current index is greater than next index return false
        for(int i = 0; i < list.length - 1; i++)
        {
            if(list[i] > list[i + 1])
            {
               isSorted = false;
               break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter list: ");

        //Take the first number from the list and make it the size of the next list
        int[] list = new int[input.nextInt()];

        for(int i = 0; i < list.length; i++)
        {
            list[i] = input.nextInt();
        }


        if(isSorted(list) == true)
        {
            System.out.println("The list is already sorted");
        }
        else
        {
            System.out.println("The list is not sorted");
        }
    }
}
