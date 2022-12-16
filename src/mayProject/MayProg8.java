package mayProject;

import java.util.Scanner;

public class MayProg8 {
    public static void main(String[] args)
    {
        // рисунок (угол)
        Scanner sc = new Scanner(System.in);
        System.out.println("введите максимальную длину");
        int a = sc.nextInt();
        for (int i=1;i<=a;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1;i<=a;i++)
        {
            for (int j=(a-1);j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
