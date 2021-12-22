package A1;

public class Kurs {
    int kursnummer;
    String name;

    public Kurs(int kursnummer, String name){
        this.kursnummer = kursnummer;
        this.name = name;
    }

    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append("Der Kurs ");
        sb.append(this.name);
        sb.append(", hat die Kursnummer ");
        sb.append(this.kursnummer);
        System.out.println(sb);
    }
}
