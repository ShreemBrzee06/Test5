package stringhw;

public class Qcomparison
{
    public static void main(String[] args)
    {
        comparison();
    }
    public static void comparison()
    {
        String a = "Krishna", b = "Ganesha";
        String c = "Jai", d = "Balaram";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(d));
        System.out.println(a.compareTo(d));
    }
}
