package mayProject;

import java.util.Scanner;

public class MayProg7 {
    public static void main(String[] args) {
        // факториал числа
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число");
        int a= sc.nextInt();
        int q=1;
        for (int x=a; x>=1 ;x--){
            q=q*x;
        }
        System.out.println("факториал числа "+a+"= "+q);
    }
}
