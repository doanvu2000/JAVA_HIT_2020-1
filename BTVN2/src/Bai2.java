import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        Scanner vt = new Scanner(System.in);
        System.out.print("Nhap so Ptu cua mang: ");
        int n = vt.nextInt();
        System.out.println("Nhap mang: ");
        int[] a = new int[n];
        for(int i =0;i<a.length;i++)
            a[i] = vt.nextInt();
        MinMax(a);
        System.out.println("Hien thi mang: ");
        Sapxep(a);
    }

    public static void MinMax(int[] a)
    {
        int Min = a[0],Max = a[0];
        for(int i =1;i<a.length;i++)
        {
            if(a[i]<Min) Min = a[i];
            if(a[i]>Max) Max = a[i];
        }
        System.out.println("Min = "+Min+"\nMax = "+Max);
    }

    public static void Sapxep(int[] a)
    {
        for(int i =0;i<a.length-1;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
