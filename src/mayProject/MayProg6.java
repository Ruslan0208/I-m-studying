package mayProject;

import java.util.Scanner;

public class MayProg6 {
    public static void main(String[] args) {
        // таблица умножения на..
        Scanner sc=new Scanner(System.in);
        System.out.println("Таблица на какое число? ");
        int a= sc.nextInt();
        for (int x=1;x<11;x++) {
            System.out.println(x + "*" + a + "=" + (x * a));
        }
    }
}
