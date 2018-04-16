import java.util.Scanner;


public class Credit {

    public static void main(String[] args) {
        System.out.println("Введите сумму кредита");
        double debt = Enter();

        System.out.println("Введите процентную ставку");
        double mon = Monthly();
        //Считаем задолженность и обязательный платеж
        while (debt < 150) {
            double pay = debt / 100 * mon; //Обязательный платеж
            System.out.println("Задолженность: " + Math.round(debt));
            System.out.println("Обязательный платеж: " + Math.round(pay));
            debt = debt - pay;
            }

        while (debt>150){
          double  r = debt / 100 * mon;
            System.out.println("Обязательный платеж: " + Math.round(r));
            double n = debt - r;
            System.out.println("Задолженность: " + Math.round(n));
            debt = debt - r;
        }


    }
    //Методы

    //Ввод данных
    public static double Enter() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    //Процентная ставка
    public static double Monthly() {
        Scanner sc2 = new Scanner(System.in);
        double st = sc2.nextDouble();
        return st / 12 + 5;
    }

}
