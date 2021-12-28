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
        sb.append(" Der Studi besucht folgende Kurse: ");
        for(int i = 0; i < this.kurszugehörigkeit.length; i++){
            sb.append(kurszugehörigkeit[i].name);
            sb.append(" ");
        }
        System.out.println(sb);

    }

    public void einschreiben(Kurs kurs){
        if(kurs.einschreiben()) {
            int anzahlKurse = this.kurszugehörigkeit.length;
            Kurs[] temp = Arrays.copyOf(kurszugehörigkeit, anzahlKurse + 1);
            kurszugehörigkeit = temp;
            kurszugehörigkeit[anzahlKurse] = kurs;
        }
        else{
            System.out.println("Der Kurs " + kurs.name + " ist leider schon voll!");
        }
    }
}
