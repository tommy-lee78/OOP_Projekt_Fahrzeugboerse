import java.util.ArrayList;
import java.util.Scanner;

/**
 * Thomas Heinrich
 * Datenbank
 */
public class Datenbank {
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Fahrzeug> fahrzeugList = new ArrayList<>();

    // ###### Fahrzeuge anlegen ######
    public void fzgAnlegenPkw(String marke, String modell,
                           String baujahr, String farbe, double preis){

        Pkw pkw = new Pkw(marke, modell, baujahr, farbe, preis);

                fahrzeugList.add(pkw);
    }
    public void fzgAnlegenLkw(String marke, String modell,
                              String baujahr, String farbe, double preis){

        Lkw lkw = new Lkw(marke, modell, baujahr, farbe, preis);

        fahrzeugList.add(lkw);
    }
    public void fzgAnlegenBoot(String marke, String modell,
                              String baujahr, String farbe, double preis){

        Boot boot = new Boot(marke, modell, baujahr, farbe, preis);

        fahrzeugList.add(boot);
    }
    public void fzgAnlegenMotorrad(String marke, String modell,
                               String baujahr, String farbe, double preis){

        Motorrad motorrad = new Motorrad(marke, modell, baujahr, farbe, preis);

        fahrzeugList.add(motorrad);
    }

    // ###### Fahrzeug bearbeiten ######
    public void fzgBearbeitenInfo(){
        int anzahl = 0;

        for(int i = 0; i < fahrzeugList.size(); i++){
            anzahl++;
            System.out.println("-------------------------------------------------------");
            System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
            System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
            System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
            System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
            System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
            System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
            System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
            System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
        System.out.println("-------------------------------------------------------");
    }
    public void fzgBearbeiten(int idNr){

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getFahrzeugId() != idNr){
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug existiert nicht!");
            }
            if(fahrzeugList.get(i).getFahrzeugId() == idNr){
                System.out.println("Bitte Marke eingeben:");
                String marke = sc.nextLine();
                fahrzeugList.get(i).setMarke(marke);
                System.out.println("Bitte Modell eingeben:");
                String modell = sc.nextLine();
                fahrzeugList.get(i).setModell(modell);
                System.out.println("Bitte Baujahr eingeben:");
                String baujahr = sc.nextLine();
                fahrzeugList.get(i).setBaujahr(baujahr);
                System.out.println("Bitte Farbe eingeben:");
                String farbe = sc.nextLine();
                fahrzeugList.get(i).setFarbe(farbe);
                System.out.println("Bitte Preis eingeben:");
                double preis = sc.nextDouble();
                fahrzeugList.get(i).setPreis(preis);

                System.out.println("-------------------------------------------------------");
                System.out.println("Das Fahrzeug mit der ID " + idNr + " wurde bearbeitet!");
                erneutBearbeiten();
            }
        }

    }
    public void erneutBearbeiten(){ // kleiner Fehler beim Logout
        System.out.println("-------------------------------------------------------");
        System.out.println("Möchten Sie ein weiteres Fahrzeug bearbeiten? J / N");
        String inputBearbeiten = sc.next().toUpperCase();
        if(inputBearbeiten.equals("J")){
            MainBoerse.fzgBearbeiten();
        }
        else if(inputBearbeiten.equals("N")){
            //MainBoerse.hauptMenue();
        }
        else{
            System.out.println("Tipfehler bei wiederholtem bearbeiten!");
            erneutBearbeiten();
        }
    }

    // ###### Fahrzeug nach Kriterien suchen ######
    public void fzgSuchen(int idNr){ // kleiner Fehler beim Logout
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe des gesuchten Fahrzeugs:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getFahrzeugId() == idNr){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchenTyp(String fzgTyp){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getFahrzeugtyp().equals(fzgTyp)){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchenMarke(String marke){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getMarke().equals(marke)){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchenModell(String modell){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getModell().equals(modell)){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchenBaujahr(String baujahr){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getBaujahr().equals(baujahr)){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchenFarbe(String farbe){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getFarbe().equals(farbe)){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }
    public void fzgSuchen(double preis){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getPreis() == preis){
                anzahl++;
                System.out.println("-------------------------------------------------------");
                System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }

    // ###### Fahrzeug nach Eigenschaft suchen ######
    public void fzgSuchen(String eigenschaft){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe der gesuchten Fahrzeuge:");
        // Preis lässt sich zwar von String zu double parsen mit, Double.parseDouble(eigenschaft)
        // dadurch kommt allerdings die Suche durcheinander, dessen fehler ich nicht finde

        for(int i = 0; i < fahrzeugList.size(); i++){
                if (fahrzeugList.get(i).getFahrzeugtyp().equals(eigenschaft) || fahrzeugList.get(i).getMarke().equals(eigenschaft)
                        || fahrzeugList.get(i).getModell().equals(eigenschaft) || fahrzeugList.get(i).getBaujahr().equals(eigenschaft)
                        || fahrzeugList.get(i).getFarbe().equals(eigenschaft)) {
                    anzahl++;
                    System.out.println("-------------------------------------------------------");
                    System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
                    System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
                    System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
                    System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
                    System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
                    System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
                    System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
                    System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
                }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
    }

    // ###### Fahrzeug löschen ######
    public void fzgLoeschenInfo(){
        int anzahl = 0;

        for(int i = 0; i < fahrzeugList.size(); i++){
            anzahl++;
            System.out.println("-------------------------------------------------------");
            System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
            System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
            System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
            System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
            System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
            System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
            System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
            System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
        System.out.println("-------------------------------------------------------");
    }
    public void fzgLoeschen(int idNr){

        for(int i = 0; i < fahrzeugList.size(); i++){
            if(fahrzeugList.get(i).getFahrzeugId() != idNr){
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug existiert nicht!");
            }
            if(fahrzeugList.get(i).getFahrzeugId() == idNr){
                fahrzeugList.remove(i);
                System.out.println("=======================================================");
                System.out.println("Fahrzeug mit der ID " + idNr + " wurde gelöscht!");
                System.out.println("-------------------------------------------------------");
                break;
            }
        }

    }

    // ###### Fahrzeuge ausgeben ######
    public void writeDatensatz(){
        int anzahl = 0;
        System.out.println("=======================================================");
        System.out.println("Ausgabe aller Fahrzeuge:");

        for(int i = 0; i < fahrzeugList.size(); i++){
            anzahl++;
            System.out.println("-------------------------------------------------------");
            System.out.println("------ Fahrzeug " + "(" + anzahl + ") ------\n");
            System.out.println("ID:\t\t\t " + fahrzeugList.get(i).getFahrzeugId());
            System.out.println("Fahrzeugtyp: " + fahrzeugList.get(i).getFahrzeugtyp());
            System.out.println("Marke:\t\t " + fahrzeugList.get(i).getMarke());
            System.out.println("Modell:\t\t " + fahrzeugList.get(i).getModell());
            System.out.println("Baujahr:\t " + fahrzeugList.get(i).getBaujahr());
            System.out.println("Farbe:\t\t " + fahrzeugList.get(i).getFarbe());
            System.out.println("Preis:\t\t " + fahrzeugList.get(i).getPreis());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Anzahl der Fahrzeuge: " + anzahl);
        System.out.println("-------------------------------------------------------");
    }

}
