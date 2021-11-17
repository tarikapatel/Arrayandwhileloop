//2. Write a Java program to test the equality of two arrays.
public class ArraysEqualMethodTwo {
    public  static void main(String[]args) {
        int array1[] = {10, 20, 30,76};
        int array2[] = {10, 20, 30,96};

        if (array1.length == array2.length)
        {
            System.out.print("Array 1 and Array 2 are equal.");
        }
        else
        {
            System.out.print("Array 1 and Array 2 are not equal.");
        }
    }
}
