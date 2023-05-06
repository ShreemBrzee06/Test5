package stringhw;

public class Qcontains {
    public static void main(String[] args)
    {
        contains();
    }
    public static void contains()
    { String  str = "Software testing help";
        String str1 = "testing";
        String str2 = "blog";
        System.out.println("software testing help: " + str.contains(str));
        System.out.println("testing blog: " +str.contains(str1));
        System.out.println("blog :" + str.contains(str2));

    }
}
