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

        // 2.5 ���������� � ������ � ��������
        if (!isBlocked && coffeeAmount >= cappuccinoCoffeeRequired &&
            (skimmedMilkAmount >= cappuccinoMilkRequired ||
            milkAmount >= cappuccinoMilkRequired)) {
            System.out.println("������� ����");
        } else {
           System.out.println("���-�� ����� �� ��� :(");
        }

        //��������� ��� ||
        //if (skimmedMilkAmount >= cappuccinoMilkRequired ||
        //    milkAmount >= cappuccinoMilkRequired ||
        //    lowLactoseMilkAmount >= cappuccinoMilkRequired) {
        //    System.out.println("������ ����������");
        //} else {
        //    System.out.println("������ ������������ :(");
        //}
        // �������� � && � �� !
        //if (!isBlocked && milkAmount >= cappuccinoMilkRequired &&
        //    coffeeAmount >= cappuccinoCoffeeRequired) {
        //    System.out.println("������� ����");
        //} else {
        //   System.out.println("���-�� ����� �� ��� :(");
        //}

        // ��������� ��� ||
        // if (coffeeAmount >= cappuccinoMilkRequired ||
        //   skimmedMilkAmount >= cappuccinoMilkRequired) {
        //    System.out.println("������ ����������");
        //} else {
        //    System.out.println("������������ ������������ :(");
        //}
    }
}
