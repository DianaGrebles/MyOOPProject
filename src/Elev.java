public class Elev {
    String nume;
    static String diriginte="Isoscel";
    //diriginte=acelasi pentru toate obiectele

    public Elev(String nume) {
        this.nume = nume;
    }
    public void metodanonstatica() {
        System.out.println("metoda non statica");
    }
    public static void metodastatica(){
        System.out.println("metoda statica");
    }
}
