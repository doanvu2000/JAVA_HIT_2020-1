import java.util.Scanner;

public class Bai4
{
    public static void main(String[] args)
    {
        Scanner vt = new Scanner(System.in);
        System.out.print("Nhap so luong Ptu: ");
        int n = vt.nextInt();
        int[] a = new int[n];
        System.out.println("\tNHAP MANG:");
        for(int i =0;i<a.length;i++)
            a[i] = vt.nextInt();
        int S =0;
        for(int i =0;i<a.length;i++)
        {
            S+= SNT(a[i])?a[i]+prime(i)-i:a[i];
        }
        System.out.println("Tong S = "+S);
    }

    public static boolean SNT(int a)
    {
        for(int i =2;i<=Math.sqrt(a);i++)
            if(a%i ==0 )    return false;
        return a>1;
    }

//     public static int prime(int n)
//     {
//         int k =0,s=0;
//         for(int i=2;;i++)
//         {
//             if(SNT(i))
//             {
//                 s+=i;
//                 k++;
//                 if(k > n ) break;
//             }
//         }
//         return s;
//     }
}
