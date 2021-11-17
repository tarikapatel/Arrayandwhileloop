// 7. WAP to test if an array contains specific value
public class ArraySpecificValue {
    public static void main(String[]args){

        int array[] = {1,2,3,4,5,6,7,8,9};
        int find = 1;
        boolean found = false;
        //String name = "john";// put in to track and understand the concepts
// this code can be executed in below two ways- 1. by comparing 2. by for loop
//        for(int y: array) {
//            if (y == find) {
//                found = true;
//               // name = "Tamu";
//                break;
//            }
//        }
        for(int y = 0; y < array.length; y++) {
            if (y == find) {
                found = true;
               // name = "Tamu";
                break;
            }
        }
        //System.out.println(name); // false - printing to understand concept
        if (found) {
            System.out.print(find + " was found in an array");
        } else {
            System.out.print(find + " was NOT found in an array");
        }
    }
}
