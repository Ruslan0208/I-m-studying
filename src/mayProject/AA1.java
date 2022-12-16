package mayProject;


import java.util.Scanner;

public class AA1 {
    public static void main(String[] args) {

            String cold = "на улице холодно";
            String warm = "на улице тепло";
            //напишите тут ваш код
            System.out.println("введите температуру ");
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            if(t<0){
                System.out.println(cold);

            }
            if(t>0){
                System.out.println(warm);

        }

    }

}
