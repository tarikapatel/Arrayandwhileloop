//3. WAP to enter any String and count the total number of 'a' in that String.
public class CountOccurrence {
    public static void main(String[]args){
        String str = ("I love automation testing.");
        int count = 0 ;
        for (int i = 0; i < str.length(); i++)
        {
            //System.out.println(i + " position in string");//just for understanding
            if (str.charAt(i) == 'a')
            {
                //System.out.println(count + " of 'a' before increase");//understand
                count++;
                //System.out.println(count + " of 'a' after increment");//understand
            }
        }
        System.out.println("Character 'a' appears " + count + " times in this string.");

    }
}
