package mayProject;
// дом и квартиры
import java.util.Scanner;

    public class MayProg4 {


    public static void main(String[] args) {
        int K;
        int PA;
        int H;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры___");
        K = sc.nextInt();
        // подъезд
        PA = (9 * 4);
        if (K <= PA) {
            System.out.println("первый подъезд");
            H=(K-1)/4;
                    System.out.println("Этаж "+(H+1));
        }
        if (K > PA && K <= (PA * 2)) {
            System.out.println("второй подъезд");
            H=(K-PA-1)/4;
            System.out.println("Этаж "+(H+1));
        }
        if (K > (PA * 2) && K <= (PA * 3)) {
            System.out.println("третий подъезд");
            H=(K-2*PA-1)/4;
            System.out.println("Этаж "+(H+1));
        }
        if (K > (PA * 3) && K <= (PA * 4)) {
            System.out.println("четвертый подъезд");
            H=(K-3*PA-1)/4;
            System.out.println("Этаж "+(H+1));
        }
        if (K > (PA * 4) && K <= (PA * 5)) {
            System.out.println("пятый подъезд");
            H=(K-4*PA-1)/4;
            System.out.println("Этаж "+(H+1));
        }
        if (K > (PA * 5)) {
            System.out.println("квартиры не существует");
        }
    }
}