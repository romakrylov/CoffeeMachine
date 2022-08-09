import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappuccinoMilkRequired ||
                milkAmount >= cappuccinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappuccinoCoffeeRequired;

        boolean hasErrors = false;

// 2.6 Вложенные условия

        if (isBlocked) {
            System.out.println("Кофемашина заблокирована");
            hasErrors = true;
        }
        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно :(");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Молока недостаточно :(");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
// с использованием переменных
        //if (!isBlocked && coffeeIsEnough && milkIsEnough) {
        //    System.out.println("Готовим кофе");
        //} else {
        //    System.out.println("Что-то пошло не так :(");
        //}

// 2.5 Приоритеты и скобки в условиях
//if (!isBlocked && coffeeAmount >= cappuccinoCoffeeRequired &&
//    (skimmedMilkAmount >= cappuccinoMilkRequired ||
//    milkAmount >= cappuccinoMilkRequired)) {
//    System.out.println("Готовим кофе");
//} else {
//   System.out.println("Что-то пошло не так :(");
//}

//перератор или ||
//if (skimmedMilkAmount >= cappuccinoMilkRequired ||
//    milkAmount >= cappuccinoMilkRequired ||
//    lowLactoseMilkAmount >= cappuccinoMilkRequired) {
//    System.out.println("Молока достаточно");
//} else {
//    System.out.println("Молока недостаточно :(");
//}
// оператор И && и НЕ !
//if (!isBlocked && milkAmount >= cappuccinoMilkRequired &&
//    coffeeAmount >= cappuccinoCoffeeRequired) {
//    System.out.println("Готовим кофе");
//} else {
//   System.out.println("Что-то пошло не так :(");
//}

// опрератор или ||
// if (coffeeAmount >= cappuccinoMilkRequired ||
//   skimmedMilkAmount >= cappuccinoMilkRequired) {
//    System.out.println("Молока достаточно");
//} else {
//    System.out.println("Ингридиентов недостаточно :(");
//}


