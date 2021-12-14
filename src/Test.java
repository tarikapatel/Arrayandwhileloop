public class Test {
//to check what difference does it make when we use ++i or i++ in a for loop?
    public static void main(String[]args)
    {
        int a=1;
//        System.out.println(++a);
        System.out.println(++a);
        System.out.println(a);
//        Test.increaseFirst();
//        System.out.println();
//        Test.increase();
    }

    public static void increase()
    {
        for (int i=0;i<=10;i++)
        System.out.print(i + " ");
    }
    public static void increaseFirst()
    {
        for(int j = 0; j<=10; ++j)
            System.out.print(j + " ");
    }
}
