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

// 2.6 ��������� �������

        if (isBlocked) {
            System.out.println("���������� �������������");
            hasErrors = true;
        }
        if (!coffeeIsEnough) {
            System.out.println("���� ������������ :(");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("������ ������������ :(");
            hasErrors = true;
        }

        if (!hasErrors) {
            System.out.println("������� ����");
        }
    }
}
// � �������������� ����������
        //if (!isBlocked && coffeeIsEnough && milkIsEnough) {
        //    System.out.println("������� ����");
        //} else {
        //    System.out.println("���-�� ����� �� ��� :(");
        //}

// 2.5 ���������� � ������ � ��������
//if (!isBlocked && coffeeAmount >= cappuccinoCoffeeRequired &&
//    (skimmedMilkAmount >= cappuccinoMilkRequired ||
//    milkAmount >= cappuccinoMilkRequired)) {
//    System.out.println("������� ����");
//} else {
//   System.out.println("���-�� ����� �� ��� :(");
//}

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


