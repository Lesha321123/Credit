import java.util.Scanner;

public class Credit {

    public static void main(String[] args) {

        System.out.println("Введите сумму кредита");
        int i = Enter();


        System.out.println("Введите процентную ставку");
        double mon = Monthly();


        System.out.println("Ежемесячный платеж");
        double com = i /100 * mon;
        System.out.println(com);

    }
    //Методы
    //Ввод данных
    public static int Enter() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    //Процентная ставка
    public static double Monthly() {
        Scanner sc2 = new Scanner(System.in);
        double st = sc2.nextInt();
        return st / 12 + 5;
    }

}
