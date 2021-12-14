import java.util.Arrays;
//2. Write a Java program to test the equality of two arrays.
public class ArraysEqual
{
    public static void main(String[] args)
    {
        int[] array1 =  {2, 5, 7, 9, 11};
        int[] array2 =  {2, 7, 7, 9, 11};

       if(Arrays.equals(array1,array2)) // this validates datatype,length and index values

        {
            System.out.println("Two arrays are equal.");
        }
        else
        {
            System.out.println("Two arrays are not equal.");
        }
    }
}