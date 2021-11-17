//5. Write a Java program to find the common elements between two arrays (string values).
import java.util.Arrays;
public class ArrayCommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] array2 = {"Thursday", "Friday", "Sunday"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));


        for (int str = 0; str < array1.length; str++) {
           // System.out.println(str + "= str");// to understand value
            for (int str2 = 0; str2 < array2.length; str2++) {
                //System.out.println(str2 + " Str1");// to understand value
                if (array1[str] == (array2[str2])) {
                    System.out.println("Common elements between two arrays is : " + (array1[str]));
                }
            }
        }
    }
}