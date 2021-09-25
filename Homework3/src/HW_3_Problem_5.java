import java.util.Scanner;

public class HW_3_Problem_5 {

    public static int partition(int[] list)
    {
        //Create variables
        int first = 0;
        int low = first + 1;
        int high = list.length - 1;
        int pivot = list[first];


        while (high > low)
        {
            //If low is less than high and is less than the pivot point increment low
            while (low <= high && list[low] <= pivot)
            {
                low++;
            }

            //If low is less than high and high is greater than pivot decrement high
            while (low <= high && list[high] > pivot)
            {
                high--;
            }

            //Swap high and low positions
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        //If high is greater than low and the value of high in array is >= pivot decrement high
        while (high >= low && list[high] >= pivot)
        {
            high--;
        }

        if (high > first)
        {
            //Swap first and high
            int temp = list[high];
            list[high] = list[first];
            list[first] = temp;
            return high;
        }
        else
        {
            return first;
        }
    }

    public static void main(String[] args)
    {
        //Create scanner and input first number to get size of list
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();

        //Add to the list
        int[] list = new int[size];
        for(int i = 0; i < size; i++)
        {
            list[i] = input.nextInt();
        }

        //Call partition function
        partition(list);

        //Display new list after the partition
        System.out.print("After the partition, the list is ");

        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}
