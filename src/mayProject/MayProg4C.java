package mayProject;
// мой дом и квартиры
import java.util.Scanner;

public class MayProg4C {


    public static void main(String[] args) {
        int K;
        int PA;
        int H;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры___");
        K = sc.nextInt();
        // подъезд
        int P1 = 7 * 16 - 1;
        int P2 = 7 * 14 - 1;
        int P3 = 7 * 12 - 1;

        PA = P1 + P2 + P3;

        if (K <= P1) {
            System.out.println("первый подъезд");
            if (K >= 1 && K <= 6) {
                H = 0;
            }
            H = (K) / 7;
            System.out.println("Этаж " + (H + 1));
        }
        if (K > P1 && K <= (P1 + P2)) {
            System.out.println("второй подъезд");
            if ((K - P1) >= 1 && (K - P1) <= 6) {
                H = 0;
            }
            H = ((K - P1)) / 7;
            System.out.println("Этаж " + (H + 1));
        }
        if (K > (P1 + P2) && K <= PA) {
            System.out.println("третий подъезд");
            if ((K-(P1 + P2)) >= 1 && (K - (P1 + P2)) <= 6) {
                H = 0;
            }
                H = (K - (P1 + P2)) / 7;
                System.out.println("Этаж " + (H + 1));
            }

            if (K > PA) {
                System.out.println("квартиры не существует");
            }
        }
    }
