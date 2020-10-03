import java.util.Scanner;

public class Bai6
{
    public static void main(String[] args)
    {
        Scanner vt = new Scanner(System.in);
        String str = vt.nextLine();
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        String temp[] = str.split(" ");
        str ="";
        for(int i =0;i<temp.length;i++)
        {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase()+ temp[i].substring(1);
            if(i<temp.length-1)
                str += " ";
        }
        System.out.println("Chuoi: "+str);
    }
}
