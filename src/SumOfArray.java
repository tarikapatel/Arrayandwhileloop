//WAP to sum values of an int array
public class SumOfArray {
    public static void main(String[]args){
        int[] array1 =  {2, 5, 7, 9, 11}; // sum = 34

        int total = 0;

        for(int x: array1) // Compare(:) int x with array 1
        {
            //System.out.println(x); to check what int x value is before total
            //System.out.println("Total Before: " + total);
            total = total + x;
            //System.out.println("Total After: " + total); // to check what is int x value after total
        }
        System.out.println("Sum of an array is: " + total);
    }
}
