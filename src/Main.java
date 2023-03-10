public class Main {
    public static void main(String[] args) {
        System.out.println();
        int bill = 340;
        int payment = 1055;

        int bonus;
        if (payment > 1000) {
            bonus = payment/100;
        } else {
            bonus = 0;
        }

        int amount = bill + payment+bonus;


        System.out.println("Бонусные рубли:" + bonus);
        System.out.println("Итоговый счет:" + amount);

    }
}