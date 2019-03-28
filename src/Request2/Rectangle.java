package Request2;

//*******************************************************************
// Program Klasa prostokąt
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj A");
        int sideA = input.nextInt();
        System.out.println("Podaj B");
        int sideB = input.nextInt();
        System.out.println("Pole wynosi: " + sideA * sideB + "cm2");
        System.out.println("Obwod wynosi wynosi: " + 2 * (sideA + sideB) + "cm2");
        System.out.println("Przekatna wynosi wynosi: " + Math.sqrt(2 * (sideA + sideB)) + "cm2");
    }
}