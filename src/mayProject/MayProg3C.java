package mayProject;
// наибольшее из четырех целых чисел
import java.util.Scanner;

public class MayProg3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("число 1= ");
        int A= sc.nextInt();
        System.out.println("число 2= ");
        int B= sc.nextInt();
        System.out.println("число 3= ");
        int C= sc.nextInt();
        System.out.println("число 4= ");
        int D= sc.nextInt();
        if(A>=B&&A>=C&&A>=D){
                    System.out.println("A= "+A);
            }

        //
        if (B>=C && B>=D && B>=A) {
                    System.out.println("B= " + B);
        }

        //
        if (C>=D && C>=B && C>=A) {
                    System.out.println("C= " + C);
        }
        //
        if (D>=C && D>=B && D>=A) {

                    System.out.println("D= " + D);

        }
    }
    }