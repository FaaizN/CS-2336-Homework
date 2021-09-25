import java.util.*;

public class HW_3_Problem_1 {

    /**Return true if the card number is valid */
    public static boolean isValid(long number)
    {
        boolean valid = false;

        //get size of card number
        int digitCount = getSize(number);

        //get first k number of digits
        int prefix = (int) getPrefix(number, 1);

        //If digitCount is >= 13 && <= 16 and prefixMatch result is true compute odd and even sum
        if((digitCount > 13 && digitCount <= 16) && prefixMatched(number, prefix))
        {
            //Compute sum
            long sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

            //if sum divisible by 10 valid is true
            if(sum % 10 == 0)
            {
                valid = true;
            }
        }
        return valid;
    }

    /**Get the result from step 2*/
    public static int sumOfDoubleEvenPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        //Iterate while i < 0 to extract the  even digits and compute sum
        for(int i = getSize(number)-2; i >= 0; i-=2)
        {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number)
    {
        int total = 0;
        if(number <= 9 && number >= 1)
        {
            return number;
        }
        else
        {
            while(number>0)
            {
                total += number % 10;
                number = number / 10;
            }

        }
        return total;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number)
    {
        int sum = 0;
        String num = number + "";
        //Iterate to extract the odd digits and compute sum
        for (int i = getSize(number) - 1; i >= 0; i -= 2)
        {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d)
    {
        boolean check = false;

        //Use switch to test different card brand numbers
        switch (d)
        {
            //Visa
            case 4:
                check = true;
                break;

            //Mastercard
            case 5:
                check = true;
                break;

            //Discover
            case 6:
                check = true;
                break;

            //AMEX
            case 37:
                check = true;
                break;
        }

        return check;
    }

    /** Return the number of digits in d */
    public static int getSize(long d)
    {
        int size = 0;
        while(d > 0)
        {
            d = d/10;
            size++;
        }
        return size;
    }

    /** Return the first k number of digits from number. If the
    * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k)
    {
        //Use substring to parse through and get the individual digits
        if (getSize(number) > k)
        {
            String num = number + "";
            return  Long.parseLong(num.substring(0, k));
        }
        return number;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
        long cardNum = input.nextLong();

        if(isValid(cardNum) == true)
        {
            System.out.println(cardNum + " is valid");
        }
        else
        {
            System.out.println(cardNum + " is invalid");
        }
        //System.out.println(cardNum + " is " + (isValid(cardNum) ? "valid" : "invalid"));
    }
}
