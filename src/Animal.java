public class Animal {
    String nume;
    String culoare;
    Boolean vegetarian;

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, Boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal() {
        nume = "unknown";
        culoare = "unkown";
        vegetarian = false;
    }

    public void mananca() {
        System.out.println(nume + "mananca");
    }

    public void doarme() {
        System.out.println(nume + "doarme");

    }

    public String afiseazaculoarea() {
        return nume + "are culoarea" + culoare;
    }


}
