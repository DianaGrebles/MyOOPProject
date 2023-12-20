public class CarteTest {
    double pret;
    String titlu;
    String autor;

    public double getPret() {
        return pret;
    }

    ;

    public String getTitlu() {
        return titlu;
    }

    ;

    public String Afiseaza() {
        return "Cartea" + titlu + " are ca autor";
    }

    Carte carte1 = new Carte();
    carte1.autor="Mihai Eminescu";
    carte1.titlu="Poezii";
    Carte carte2 = new Carte();
    carte2.titlu="Amintiri din copiarie";
    carte2.autor="Ion Creanga";

}




