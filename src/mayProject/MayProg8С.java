package mayProject;

import java.util.Scanner;

public class MayProg8С
{
    public static void main(String[] args)
    {
        // рисунок часы(в работе)
        Scanner sc = new Scanner(System.in);
        System.out.println("введите максимальную длину(нечетное число)");
        int a = sc.nextInt();
        if ((a%2)<0)
        {
            System.out.println("некорректное число");
        }
        else
        {
        for (int i=1;i<=((a+1)/2);i++)
        {
            for (int k = a; k >= 1; k = k - 2)
            {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
}
