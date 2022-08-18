/**
 * Thomas Heinrich
 * Mutterklasse Fahrzeug
 */
public class Fahrzeug {
    private static int startId = 1;
    private String fahrzeugtyp, marke, modell, baujahr, farbe;
    private double preis;
    private int fahrzeugId;

    public Fahrzeug(String fahrzeugtyp, String marke, String modell, String baujahr, String farbe, double preis){
        this.fahrzeugtyp = fahrzeugtyp;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.farbe = farbe;
        this.preis = preis;
        this.fahrzeugId = startId++;
    }

    // Setter
    public void setFahrzeugtyp(String fahrzeugtyp){
        this.fahrzeugtyp = fahrzeugtyp;
    }
    public void setMarke(String marke){
        this.marke = marke;
    }
    public void setModell(String modell){
        this.modell = modell;
    }
    public void setBaujahr(String baujahr){
        this.baujahr = baujahr;
    }
    public void setFarbe(String farbe){
        this.farbe = farbe;
    }
    public void setPreis(double preis){
        this.preis = preis;
    }
    public void setFahrzeugId(int fahrzeugId){
        this.fahrzeugId = fahrzeugId;
    }

    // Getter
    public String getFahrzeugtyp(){
        return this.fahrzeugtyp;
    }
    public String getMarke(){
        return this.marke;
    }
    public String getModell(){
        return this.modell;
    }
    public String getBaujahr(){
        return this.baujahr;
    }
    public String getFarbe(){
        return this.farbe;
    }
    public double getPreis(){
        return this.preis;
    }
    public int getFahrzeugId(){
        return this.fahrzeugId;
    }

}
