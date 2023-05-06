public class Practicalsofstrings {
   static String a = "Krishna";

    public static void main(String[] args)
    {   length();
        concat();
        charm();
        comparison();
        contains();
        index();
        stos();


    }

    public static void length()// length method
    {
        System.out.println(a.length());
    }
    public static void concat()// concat
    { String str1 = "Software";
        String str2 = "Testing";
        System.out.println("Expected out put: " + str1 +" "+ str2);
    }

    public static void charm()
    { String str3 = "Krishna";
        char a1 = str3.charAt(6);
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(1));
        System.out.println(str3.charAt(2));
        System.out.println(str3.charAt(3));
        System.out.println(str3.charAt(4));
        System.out.println(str3.charAt(5));
        System.out.println(str3.charAt(6));
        System.out.println(a1);

    }

    public static void comparison()
    {
        String a = "Krishna", b = "Ganesha";
        String c = "Jai", d = "Balaram";
        System.out.println(a.compareTo(b));
        System.out.println(c.compareTo(d));
        System.out.println(a.compareTo(d));
    }

    public static void contains()
    { String  str = "Software testing help";
        String str1 = "testing";
        String str2 = "blog";
        System.out.println("software testing help: " + str.contains(str));
        System.out.println("testing blog: " +str.contains(str1));
        System.out.println("blog :" + str.contains(str2));

    }

    public static void index()
    {
        String str4 = "I love Krisha";
        System.out.println(str4);
        System.out.println("Index of I is : " + str4.indexOf('I'));;
        System.out.println("Index of l is : " + str4.indexOf('l'));
        System.out.println("Index of a is : " + str4.lastIndexOf('a'));

    }

    public static void stos(){
        Integer obj = new Integer(10);
        System.out.println(obj);
        String str = obj.toString();
        String str1 = obj.toString(80);
        String str2 = obj.toString(9823,2);
        System.out.println("The String representation is" +" "+ str);
        System.out.println("The String representation is" +" "+ str1);
        System.out.println("The String representation is" +" "+ str2);
    }
}
