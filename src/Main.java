import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        if (!isBlocked && milkAmount >= cappuccinoMilkRequired &&
            coffeeAmount >= cappuccinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }

        //if (coffeeAmount >= cappuccinoMilkRequired ||
        //   skimmedMilkAmount >= cappuccinoMilkRequired) {
        //    System.out.println("Молока достаточно");
        //} else {
        //    System.out.println("Ингридиентов недостаточно :(");
        //}
    }
}
