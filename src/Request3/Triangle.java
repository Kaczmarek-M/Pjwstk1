package Request3;

//*******************************************************************
// Program Klasa tojkat
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************

import java.util.Scanner;

public class Triangle {

    private static double sideA;
    private static double sideB;
    private static double sideC;

    private static void circumferenceOfTheTriangle() {
        double circumferenceOfTheTria = sideA + sideB + sideC;
        System.out.println("Obwod trojkata wynosi: " + circumferenceOfTheTria);
    }

    private static void triangleField() {
        double halfField = (sideA + sideB + sideC) / 2;
        double field = Math.sqrt(halfField * (halfField - sideA) * (halfField - sideB) * (halfField - sideC));
        System.out.format("\nPole trojkata wynosi: " + "%.2f%n", field);
    }

    private static void typeOfTriangle() {
        for (int i = 0; i < 1; i++) {
            if ((sideA == sideB) && (sideA == sideC) && (sideB == sideC)) {
                System.out.println("Trojkat jest rownoboczny");
            }
            if ((sideA == sideB) && (sideA != sideC) || (sideB == sideC) && (sideB != sideA) ||
                    (sideA == sideC) && (sideA != sideB)) {
                System.out.println("Trojkat jest rownoramienny");
            }
            if ((sideA != sideB) && (sideA != sideC) && (sideB != sideC)) {
                System.out.println("Trojkat jest roznoboczny");
            }
        }
    }
    private static void dataUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj bok A");
        sideA = sc.nextInt();
        System.out.println("Podaj bok B");
        sideB = sc.nextInt();
        System.out.println("Podaj bok C");
        sideC = sc.nextInt();

    }

    public static void main(String[] args) {
        Triangle.dataUser();
        Triangle.triangleField();
        Triangle.circumferenceOfTheTriangle();
        Triangle.typeOfTriangle();
    }
}
