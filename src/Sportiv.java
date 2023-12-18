abstract class Sportiv {

    String tara;
    String sport;
    Abilitate abilitate;
    //relatiedecompozitie,saumotosiroataversusmotosivehicul

    public Sportiv(String tara, String sport) {
        this.tara = tara;
        this.sport = sport;
    }

    abstract  void seAntreneaza();
    //metodeleabstractenuaubody,adica{}
    public void seOdihneste(){
        System.out.println("Sportivul se odihneste.");
    }
}
