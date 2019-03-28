package Request4;

//*******************************************************************
// Program Klasa szyfr Cezara
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************

import java.util.Scanner;

public class Caesar {

    private static String userData() {
        String data;
        System.out.println("\nPodaj tekst do zaszyfrowania: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextLine();
        return data;
    }

    private static String encrypted(String msg) {
        StringBuilder sb = new StringBuilder(msg);
        int distance = 3;
        int p;
        for (int i = 0; i < sb.length(); i++) {
            p = (int) sb.charAt(i);
            if (p + distance > 122) {
                p = 31 + (distance - (122 - p));
            } else {
                p += distance;
            }
            sb.setCharAt(i, (char) p);
        }
        return sb.toString();
    }

    private static String decryption(String msg) {
        StringBuilder sb = new StringBuilder(msg);
        int distance = 3;
        int p;
        for (int i = 0; i < sb.length(); i++) {
            p = (int) sb.charAt(i);
            if (p - distance < 32) {
                p = 123 - (distance - (p - 32));
            } else {
                p -= distance;
            }
            sb.setCharAt(i, (char) p);
        }
        return sb.toString();
    }

    private static String nameDecryption(String msg) {
        StringBuilder sb = new StringBuilder(msg);
        int distance = 5;
        int p;
        for (int i = 0; i < sb.length(); i++) {
            p = (int) sb.charAt(i);
            if (p - distance < 32) {
                p = 123 - (distance - (p - 32));
            } else {
                p -= distance;
            }
            sb.setCharAt(i, (char) p);
        }
        return sb.toString();
    }

    private static String nameMichal() {
        String nameLastName = "Michal Kaczmarek";
        StringBuilder sb = new StringBuilder(nameLastName);
        int distance = 5;
        int p;
        for (int i = 0; i < sb.length(); i++) {
            p = (int) sb.charAt(i);
            if (p + distance > 122) {
                p = 31 + (distance - (122 - p));
            } else {
                p += distance;
            }
            sb.setCharAt(i, (char) p);
        }
        return sb.toString();
    }
    private static String nameAdrian() {
        String nameLastName = "Adrian Matyszczak";
        StringBuilder sb = new StringBuilder(nameLastName);
        int distance = 5;
        int p;
        for (int i = 0; i < sb.length(); i++) {
            p = (int) sb.charAt(i);
            if (p + distance > 122) {
                p = 31 + (distance - (122 - p));
            } else {
                p += distance;
            }
            sb.setCharAt(i, (char) p);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String nameAdrian = Caesar.nameAdrian();
        System.out.println("Szyfrowane o 5 miejsc w prawo 'Adrian Matyszczak' = " + nameAdrian);
        String nameAdrianDescryption = Caesar.nameDecryption(nameAdrian);
        System.out.println("Po deszyfracji = " + nameAdrianDescryption);
        String nameMichal = Caesar.nameMichal();
        System.out.println("Szyfrowane o 5 miejsc w prawo 'Michal Kaczmarek' = " + nameMichal);
        String nameMichalDescryption = Caesar.nameDecryption(nameMichal);
        System.out.println("Po deszyfracji = " + nameMichalDescryption);
        String downloaded = Caesar.userData();
        String encryption = Caesar.encrypted(downloaded);
        System.out.println("Zaszyfrowany tekst: " + encryption);
        String decryption = Caesar.decryption(encryption);
        System.out.println("Tekst po deszyfracji: " + decryption);
    }
}
