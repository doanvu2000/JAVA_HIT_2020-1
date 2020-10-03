import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        Scanner vt = new Scanner(System.in);
        int a,b,c;
        a = vt.nextInt();
        b = vt.nextInt();
        c = vt.nextInt();
        int Max=a;
        if(b>Max)   Max = b;
        if(c>Max)   Max = c;
        System.out.println("Max = " + Max);
    }
}
