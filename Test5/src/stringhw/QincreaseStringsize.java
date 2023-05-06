package stringhw;

public class QincreaseStringsize
{
    public static void main(String[] args)
    {
                StringBuilder a = new StringBuilder("I love Krisha");
                System.out.println("length of original String "+ a.length());
                a.setLength(15);
                System.out.println("Increased Length of String "+a);
                System.out.println("length after increase of string " + a.length());
    }

}
