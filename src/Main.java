import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        if (coffeeAmount >= cappuccinoCoffeeRequired &&
            milkAmount >= cappuccinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингридиентов недостаточно :(");
        }
    }
}
