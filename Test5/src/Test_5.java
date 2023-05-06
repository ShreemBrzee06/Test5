public class Test_5
{   int a = 10, b = 10;// IV / GLOBAL
    static int c = 5, d= 5;//SV/ GLOBal

    public static void main(String[] args)// main method /static method
    {
        Test_5 h1 = new Test_5();
        h1.n();
    }

    public static void m ()//

    {  int a = 5;
        Test_5 h1 = new Test_5();
       System.out.println(h1.a);

    }

    public void n ()// instance method
    { int a= 10; // local variable/ instance
        System.out.println(a);
        System.out.println(b);

    }
}
