package A1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie soll der neue Kurs heißen? ");
        String kursName = sc.nextLine();
        System.out.println("Welche Kursnummer soll der neue Kurs bekommen? ");
        int kursNummer = sc.nextInt();
        Kurs meinKurs = new Kurs(kursNummer, kursName);
        meinKurs.print();

        Studi Jan = new Studi("Jan", 19, 213);
        Studi Lars = new Studi("Lars", 18, 123);
        Studi Hannes = new Studi("Hannes", 15, 321);
        Jan.print();
        Lars.print();
        Hannes.print();
    }

}
