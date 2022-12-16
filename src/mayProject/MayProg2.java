package mayProject;

import java.util.Scanner;

public class MayProg2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d;
        int m;
        int g;
        System.out.println("день ");
        d= sc.nextInt();
        System.out.println("месяц ");
        m= sc.nextInt();
        System.out.println(" год ");
        g= sc.nextInt();
        System.out.println("Дата рождения    "+d+"."+m+"."+g);
    }
}
