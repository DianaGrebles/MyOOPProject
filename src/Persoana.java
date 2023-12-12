public class Persoana {
    int varsta;
    String sex;//sau char
    String nume;
    String prenume;

    public Persoana(int varsta, String sex, String nume) {
        this.varsta = varsta;
        this.sex = sex;
        this.nume = nume;
    }

    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    Persoana(){
        varsta=20;
        sex="M";
        nume="Unknown";
        prenume="Unknown";
        //saucodegenerateconstructor-selectnone,laconstructorfaraparametri
    }

}
