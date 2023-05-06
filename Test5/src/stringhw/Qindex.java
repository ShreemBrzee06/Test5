package stringhw;

public class Qindex
{
    public static void main(String[] args)
    {
        index();
    }
    public static void index()
    {
        String str4 = "I love Krisha";
        System.out.println(str4);
        System.out.println("Index of I is : " + str4.indexOf('I'));;
        System.out.println("Index of l is : " + str4.indexOf('l'));
        System.out.println("Index of a is : " + str4.lastIndexOf('a'));

    }
}
