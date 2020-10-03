import java.util.Scanner;

public class Bai3
{
    static Scanner vt = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Nhap so luong Ptu: ");
        int n = vt.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang: ");
        for(int i =0;i<a.length;i++)
            a[i] = vt.nextInt();
        Menu(a);
    }

    public  static void Menu(int[] a)
    {
        int chon;
        int[] x = a;
        do
        {
            System.out.println("Nhap 1 de hien thi mang vua tao!\n" +
                    "Nhap 2 de them 1 Ptu vao vi tri k!\n" +
                    "Nhap 3 de xoa 1 Ptu o vi tri k!\n" +
                    "Nhap 4 de Dao nguoc mang!\n" +
                    "Nhap 5 de hien thi Ptu a[1] va cac Ptu chia het cho a[1]!\n" +
                    "Nhap 0 de thoat\n" +
                    "(Luu y: Sau khi thuc hien 1 chuc nang thi mang moi se duoc luu," +
                    " mang chay tu a[1] den a[n]!)\n" +
                    "Moi ban nhap: ");
            chon = vt.nextInt();
            switch (chon)
            {
                case 1: Nhap1(x);       break;
                case 2: x = Nhap2(x);   break;
                case 3: x = Nhap3(x);   break;
                case 4: x = Nhap4(x);   break;
                case 5: Nhap5(x);       break;
                case 0:
                    System.out.println("\n\t\tDONG CHUONG TRINH!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\tNhap sai!\n\tMoi ban nhap lại!");
            }
            System.out.println("---------------------------------------------");
        }
        while (true);
    }

    public static void Nhap1(int[] a)
    {
        System.out.print("\tHIEN THI MANG: ");
        for(int i =0;i<a.length;i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    public  static int[] Nhap2(int[] a)
    {
        System.out.println("\t\t-----THEM VI TRI-----");
        System.out.print("Nhap vi tri k: ");
        int  k = vt.nextInt();
        System.out.println("Nhap so muon them: ");
        int l = vt.nextInt();
        int[] b = new int[a.length+1];
        for(int i = 0;i<b.length-1;i++)
            b[i] = a[i];
        if(k>b.length-1)
            b[b.length-1] = l;
        else
        {
            if(k<=0) k =1;
            for(int i = b.length-1;i>=k;i--)
                b[i] = b[i-1];
            b[k-1] = l;
        }
        Nhap1(b);
        return b;
    }

    public static int[] Nhap3(int[] a)
    {
        System.out.println("\t\t-----XOA VI TRI-----");
        System.out.print("Nhap vi tri can xoa: ");
        int k = vt.nextInt();
        int[] c = new int[a.length-1];
        if(k>a.length-1)
            for(int i =0;i<a.length-1;i++)
                c[i] = a[i];
        else
        {
            if(k<=0)    k =1;
            for(int i =0;i<k;i++)
                c[i] = a[i];
            for(int i =k;i<a.length;i++)
            {
                c[i-1] =a[i];
            }
        }
        Nhap1(c);
        return c;
    }
    public static int[] Nhap4(int[] a)
    {
        System.out.println("\t\t-----DAO MANG!-----");
        for(int i =0;i<(a.length)/2;i++)
        {
            int x = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = x;
        }
        System.out.print("\tHIEN THI MANG: ");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+ " ");
        System.out.println();
        return a;
    }

    public static void Nhap5(int[] a)
    {
        System.out.println("\t\t-----A[1] VA CAC SO CHIA HET CHO A[1]!-----");
        System.out.print("\ta[1] = "+a[0]+
        "\n\tCac Ptu chia het cho "+a[0]+": ");
        int dem =0;
        for(int i =1;i<a.length;i++)
            if(a[i]%a[0] == 0)
            {
                dem++;
                System.out.print(a[i]+" ");
            }
        if(dem == 0) System.out.print("Khong co so nao!");
        System.out.println();
    }
}
