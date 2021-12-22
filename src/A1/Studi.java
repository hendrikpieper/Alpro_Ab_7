package A1;

import java.util.Arrays;

public class Studi {
    String name;
    int alter;
    int matrikelnummer;
    Kurs[] kurszugehörigkeit = new Kurs[0];

    public Studi(String name, int alter, int matrikelnummer){
        this.name = name;
        this.alter = alter;
        this.matrikelnummer = matrikelnummer;
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("Studi heißt ");
        sb.append(this.name);
        sb.append(", hat die Matrikelnummer ");
        sb.append(this.matrikelnummer);
        sb.append(" und ist ");
        sb.append(this.alter);
        sb.append(" Jahre alt.");
        System.out.println(sb);
    }

    public void einschreiben(Kurs kurs){
        if ()
        int anzahlKurse = this.kurszugehörigkeit.length;
        Kurs[] temp = Arrays.copyOf(kurszugehörigkeit, (kurszugehörigkeit.length + 1));
        kurszugehörigkeit = temp;
        kurszugehörigkeit[kurszugehörigkeit.length] = kurs;
    }
}
