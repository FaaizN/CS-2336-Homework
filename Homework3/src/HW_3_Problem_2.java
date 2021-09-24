import java.util.*;
public class HW_3_Problem_2 {

    /** Compute the deviation of double values */
    public static double deviation(double[] x)
    {
        double mean = mean(x);
        double deviation = 0;
        for (int i = 0; i < x.length; i++) {
            deviation += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x)
    {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        System.out.println(total);
        return total / x.length;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] nums = new double[10];
        System.out.println("Enter 10 numbers: ");

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextDouble();
        }

        System.out.println("The mean is: " + mean(nums));
        System.out.println("The standard deviation is: " + deviation(nums));
    }
}

