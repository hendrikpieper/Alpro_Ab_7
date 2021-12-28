package A1;

public class Kurs {
    int kursnummer;
    String name;
    int anzahlStudis;
    int maxanzahlStudis;

    public Kurs(int kursnummer, String name, int maxanzahlStudis){
        this.kursnummer = kursnummer;
        this.name = name;
        this.maxanzahlStudis = maxanzahlStudis;
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("Der Kurs ");
        sb.append(this.name);
        sb.append(", hat die Kursnummer ");
        sb.append(this.kursnummer);
        System.out.println(sb);
    }

    public boolean einschreiben(){
        if(this.anzahlStudis < this.maxanzahlStudis){
            this.anzahlStudis += 1;
            return true;
        }
        return false;
    }


}
