//10. WAP to input any five digit number and then reverse the number
public class ReverseNumbers {
    public static void main(String[] args) {

        int number = 12345, reversed = 0;
        System.out.println("Given Number: " + number);
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
