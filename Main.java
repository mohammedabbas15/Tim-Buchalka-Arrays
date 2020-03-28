import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        // initializing the array to be used
        int [] myIntegers = getIntegers(5);

        // getting the average
        double average = getAverage(myIntegers);
        System.out.println("the average of the set of integers: " + average);

        // sorting the array in descending order
        int [] sortedInt = sortIntegers(myIntegers);
        System.out.println(Arrays.toString(sortedInt));

        // finding the minimum value in the array
        int minimum = getMin(myIntegers);
        System.out.println("the minimum value from the array: " + minimum);

        // reversing the array in place
        System.out.println("list of numbers in reverse");
        int [] reverse = reverseArray(myIntegers);
        System.out.println(Arrays.toString(reverse));

        // resizing the array
        resizeArray(myIntegers, 10);
        System.out.println(Arrays.toString(myIntegers));
    }

    public static void resizeArray(int [] array, int size)
    {
        int [] original = array;
        array = new int [size];
        for (int i = 0; i < original.length; i++)
        {
            array[i] = original[i];
        }
    }

    public static int [] reverseArray(int [] array)
    {
        for (int i = 0; i < array.length/2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int getMin(int [] array)
    {
        int minValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] < minValue)
            {
                minValue = array[i];
            }
        }
        return minValue;

    }

    public static int [] getIntegers(int number)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + number + " integer values \r");
        int [] numbers = new int[number];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    public static double getAverage(int [] numbers)
    {
        int average = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            average += numbers[i];
        }
        return (double)(average / numbers.length);
    }

    public static int [] sortIntegers(int [] numbers)
    {
        int [] sorted = Arrays.copyOf(numbers, numbers.length);
        // does essentially the same thing as below for copying the contents of an array
//        for (int i = 0; i < numbers.length; i++)
//        {
//            sorted[i] = numbers[i];
//        }
        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int i = 0; i < sorted.length-1; i++)
            {
                if (sorted[i] < sorted[i+1])
                {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}
