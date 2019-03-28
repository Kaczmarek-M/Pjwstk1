package Request1;

//*******************************************************************
// Program Klasa human
// Michał Kaczmarek s18464 i Adrian Matyszczak s19850
//
//*******************************************************************

public class Human {


    private int age;
    private int weight;
    private int height;
    private String name;
    private String isMale;
    private int feetSize;
    private long indexNumber;

    private Human(int age, int weight, int height, String name, String isMale, int feetSize, long indexNumber) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
        this.feetSize = feetSize;
        this.indexNumber = indexNumber;
    }

    private int getAge() {
        return age;
    }

    private int getWeight() {
        return weight;
    }

    private int getHeight() {
        return height;
    }

    private String getName() {
        return name;
    }

    private String getIsMale() {
        return isMale;
    }

    private int getFeetSize() {
        return feetSize;
    }

    private long getIndexNumber() {
        return indexNumber;
    }

    public static void main(String[] args) {
        Human person2 = new Human(29, 96, 197, "Adrian", "Tak", 47, 19777);
        Human person1 = new Human(33, 100, 200, "Michal", "Tak", 47, 19464);

        System.out.println("Pierwsza osoba: \n" + "Imie: " + person1.getName() + "\n" + "Wiek: " + person1.getAge() + "\n" + "Wzrost: " +
                person1.getHeight() + "\n" + "Czy mezczyzna: " + person1.getIsMale() + "\n" + "Rozmiar stopy: " + person1.getFeetSize() +
                "\n" + "Waga: " + person1.getWeight() + "\n" + "Numer indeksu: " + person1.getIndexNumber());
        System.out.println("\nDruga osoba: \n" + "Imie: " + person2.getName() + "\n" + "Wiek: " + person2.getAge() + "\n" +
                "Wzrost: " + person2.getHeight() + "\n" + "Czy mezczyzna: " + person2.getIsMale() + "\n" + "Rozmiar stopy: " + person2.getFeetSize() +
                "\n" + "Waga: " + person2.getWeight() + "\n" + "Numer indeksu: " + person2.getIndexNumber());
    }

}
