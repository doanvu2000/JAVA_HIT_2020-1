import java.util.Scanner;

public class Bai5
{
    public static void main(String[] args)
    {
        Scanner vt = new Scanner(System.in);
        String a = vt.nextLine();
        int S =0;
        for(int i =0;i<a.length();i++)
        {
            char x = a.charAt(i);
            if(Character.isDigit(x))
            {
                String str = String.valueOf(x);
                S += Integer.parseInt(str);
            }
        }
        System.out.println("S = "+S);
    }
}
