public class Main {
    public static void main(String[] args) {
        Carte carte1 = new Carte();
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35.00;
        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.autor = "Amintiri din copilarie";
        carte1.titlu = "Basme";//i-am suprascris valoarea
        //sout(carte1.afiseaza());

        Masina masina1 = new Masina();
        Masina masina2 = new Masina();
        masina2.marca = "Dacia";
        //suprascriere doar pentru obiect
        System.out.println((masina1.marca));
        System.out.println((masina2.marca));
        Masina masina3 = new Masina();
        Masina masina4 = new Masina();
        masina3.anFabricatie = 2005;
        masina4.anFabricatie = 2010;
        System.out.println((masina3.anFabricatie));

        Persoana persoana1 = new Persoana();
        System.out.println(persoana1.nume);

        Persoana persoana2 = new Persoana("Ion", "Popescu");
        System.out.println(persoana2.varsta);

        Persoana persoana3 = new Persoana();

        System.out.println(carte1.pret);
        System.out.println(carte1.getPret());
        System.out.println(carte2.afiseaza());

        Masina masina6 = new Masina("Tesla", 2022);

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Azorel");
        Animal animal3 = new Animal("Pisi", "gri");
        Animal animal4 = new Animal("Nemo", "rosu", false);

        Elev elev1=new Elev("Popescu");
        Elev elev2=new Elev("Ionescu");
        System.out.println(elev1.nume);
        elev1.diriginte="Isoscel2";
        System.out.println(elev2.diriginte);

        elev1.metodanonstatica();
        Elev.metodastatica();

        Film film1=new Film();
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1=new Inotator();
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        //aicinuamsuprascrisclasaparinte

        Maratonist maratonist1=new Maratonist();
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();
        //aiciamsuprascrisclasaparinte

        Mamifer Pisica=new Mamifer();
        Pisica.scoateSunete();
        Mamifer Caine=new Mamifer();
        Caine.scoateSunete();


    }
}

