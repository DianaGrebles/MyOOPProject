import java.util.ArrayList;

public class MyArrayList {
    //static ArrayList<String>cursuri=new ArrayList<>();
    public static void afiseazaListaCursuri(ArrayList<String>oriceLista){
        for (String c:oriceLista){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {


        ArrayList<String> listanoastra = new ArrayList<>();
        listanoastra.add("First");
        listanoastra.add("Second");
        listanoastra.add("Third");
        listanoastra.set(0, "First-replaced");
        listanoastra.remove(2);

        for (String element : listanoastra) {
            System.out.println(element);
        }
        System.out.println(listanoastra.size());
        System.out.println(listanoastra.contains("Second"));
        System.out.println(listanoastra.indexOf("Second"));

        //Ex1-Structuridedate

        ArrayList<String>cursuri=new ArrayList<>();
        cursuri.add("TestareM");
        cursuri.add("TestareA");
        cursuri.add("Front-End");
        cursuri.add("Java");
        //System.out.println("Elementuldepeadouapozitieeste"+cursuri.get(1));
       // System.out.println("Lungimealisteieste"+cursuri.size());
        System.out.println("Elementelesunt");

       afiseazaListaCursuri(cursuri);

       ArrayList<String>filme=new ArrayList<>();
       filme.add("Harry Potter");
       filme.add("HomeAlone");

       afiseazaListaCursuri(filme);
        }

    }

