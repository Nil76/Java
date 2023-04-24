import java.util.*;

public class Over {
    public static void main(String[] args) {
        Scanner nilesh=new Scanner(System.in);
        int b=nilesh.nextInt();
        int a=nilesh.nextInt();
        int c=nilesh.nextInt();
        int d=nilesh.nextInt();
        int e=nilesh.nextInt();
        // System.out.println("user enterd value of b " +b);
        // System.out.println("user enter value of a " +a);
        // System.out.println(sum(a,b));
        int f=sum(a, b,c,d,e);
        System.out.println(f);
        nilesh.close();
        // sum();
    }
    public static void sum()
    {
        System.out.println("Sum of A&B: "+(5+5));
    }
    public static int sum(int a,int b, int c, int d, int e)
    {
        return a+b+c+d+e;
    }
}
