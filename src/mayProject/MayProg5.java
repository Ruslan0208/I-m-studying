package mayProject;

import java.util.Scanner;

public class MayProg5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A1,A2,A3,A4;
        System.out.println("ввведите последовательно целое четырехзначное число  ");
        int A= sc.nextInt();
        if (A >9999 && A<1) {
            System.out.println("число не корректно ");
        }
        else {
            A1 = A / 1000;
            A2 = (A - A1*1000) / 100;
            A3 = (A - A1*1000 - A2*100) / 10;
            A4 = (A - A1*1000 - A2*100 - A3*10);
            int AA=A1+A2;
            int AB=A3+A4;
            System.out.println("сумма первой пары"+AA);
            System.out.println("сумма второй пары"+AB);
            if (AA==AB){
                System.out.println("ЧИСЛО СЧАСТЛИВОЕ!!!");
            }
            else {
                System.out.println("мимо кассы");
            }
        }

        }
    }

