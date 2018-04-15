import java.util.Scanner;

public class Credit {

    public static void main(String[] args) {
        System.out.println("Введите сумму кредита");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("Введите процентную ставку");
        Scanner sc2 = new Scanner(System.in);
        double st = sc2.nextInt();
        double mon = st / 12 + 5;

        System.out.println("Ежемесячный платеж");
        double com = i /100 * mon;

        System.out.println(com);

    }
}
