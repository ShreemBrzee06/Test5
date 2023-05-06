package stringhw;

public class Qstos {
    public static void main(String[] args)
    {
        stos();
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
