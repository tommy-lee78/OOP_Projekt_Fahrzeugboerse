import java.util.ArrayList;
import java.util.Scanner;

/**
 * Thomas Heinrich
 * Userinterface
 */
public class MainBoerse {
    static Scanner sc = new Scanner(System.in);
    static Datenbank db = new Datenbank();
    private static ArrayList<Fahrzeug> fahrzeugList = new ArrayList<>();

    public static void main(String[] args) {
        hauptMenue();
    }

    public static void hauptMenue(){

        System.out.println("=======================================================");
        System.out.println("Fahrzeugbörse      Hauptmenü      von: Thomas Heinrich");
        System.out.println("-------------------------------------------------------");
        System.out.println("1) Fahrzeug anlegen");
        System.out.println("2) Fahrzeug bearbeiten");
        System.out.println("3) Fahrzeug suchen");
        System.out.println("4) Fahrzeug löschen");
        System.out.println("0) Börse beenden");
        //System.out.println("5) Dummys erzeugen");
        //System.out.println("6) Fahrzeuge ausgeben");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte wählen: ");
        String input = sc.next();

        // ###### Anlegen ######
        if(input.equals("1")){
            fzgAnlegen();
            hauptMenue();
        }
        // ###### Bearbeiten ######
        else if(input.equals("2")){
            fzgBearbeiten();
            hauptMenue();
        }
        // ###### Suchen ######
        else if(input.equals("3")){
            suche();
            hauptMenue();
        }
        // ###### Löschen ######
        else if(input.equals("4")){
            delFahrzeug();
            hauptMenue();
        }
        // ###### Beenden ######
        else if(input.equals("0")){
            boerseBeenden();
        }
        // ###### Dummys ######
        /*else if(input.equals("5")){
            addDummys();
            hauptMenue();
        }
        // ###### alle Fahrzeuge ausgeben ######
        else if(input.equals("6")){
            db.writeDatensatz();
            hauptMenue();
        }*/
        else{
            System.out.println("Tipfehler im Menü!");
            hauptMenue();
        }
    }

    // ###### Fahrzeuge anlegen ######
    public static void fzgAnlegen(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug anlegen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Was für ein Fahrzeug möchten Sie anlegen?");
        System.out.println("-------------------------------------------------------");
        System.out.println("1) PKW");
        System.out.println("2) LKW");
        System.out.println("3) Boot");
        System.out.println("4) Motorrad");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte wählen: ");
        String inputFahrzeug = sc.next();
        if(inputFahrzeug.equals("1")){
            addFahrzeugPkw();
            //hauptMenue();
        }
        else if(inputFahrzeug.equals("2")){
            addFahrzeugLkw();
            //hauptMenue();
        }
        else if(inputFahrzeug.equals("3")){
            addFahrzeugBoot();
            //hauptMenue();
        }
        else if(inputFahrzeug.equals("4")){
            addFahrzeugMotorrad();
            //hauptMenue();
        }
        else{
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler in Fahrzeugauswahl!");
            System.out.println("-------------------------------------------------------");
            //hauptMenue();
        }

    }

    public static void addFahrzeugPkw(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug hinzufügen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte Marke eingeben:");
        sc.nextLine();
        String marke = sc.nextLine();
        System.out.println("Bitte Modell eingeben:");
        String modell = sc.nextLine();
        System.out.println("Bitte Baujahr eingeben:");
        String baujahr = sc.nextLine();
        System.out.println("Bitte Farbe eingeben:");
        String farbe = sc.nextLine();
        System.out.println("Bitte Preis eingeben:");
        String preis1 = sc.nextLine();

        try {
            if (marke.equals("") || modell.equals("") || baujahr.equals("") || farbe.equals("") || preis1.equals("")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug konnte aufgrund fehlender Eingabe \nnicht angelegt werden!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            } else {
                double preis = Double.parseDouble(preis1);
                db.fzgAnlegenPkw(marke, modell, baujahr, farbe, preis);
                addFzgAgain();
            }
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der Eingabe...\nFahrzeug wurde nicht angelegt!");
        }

    }
    public static void addFahrzeugLkw(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug hinzufügen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte Marke eingeben:");
        sc.nextLine();
        String marke = sc.nextLine();
        System.out.println("Bitte Modell eingeben:");
        String modell = sc.nextLine();
        System.out.println("Bitte Baujahr eingeben:");
        String baujahr = sc.nextLine();
        System.out.println("Bitte Farbe eingeben:");
        String farbe = sc.nextLine();
        System.out.println("Bitte Preis eingeben:");
        String preis1 = sc.nextLine();

        try {
            if (marke.equals("") || modell.equals("") || baujahr.equals("") || farbe.equals("") || preis1.equals("")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug konnte aufgrund fehlender Eingabe \nnicht angelegt werden!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            } else {
                double preis = Double.parseDouble(preis1);
                db.fzgAnlegenLkw(marke, modell, baujahr, farbe, preis);
                addFzgAgain();
            }
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der Eingabe...\nFahrzeug wurde nicht angelegt!");
        }

    }
    public static void addFahrzeugBoot(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug hinzufügen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte Marke eingeben:");
        sc.nextLine();
        String marke = sc.nextLine();
        System.out.println("Bitte Modell eingeben:");
        String modell = sc.nextLine();
        System.out.println("Bitte Baujahr eingeben:");
        String baujahr = sc.nextLine();
        System.out.println("Bitte Farbe eingeben:");
        String farbe = sc.nextLine();
        System.out.println("Bitte Preis eingeben:");
        String preis1 = sc.nextLine();

        try {
            if (marke.equals("") || modell.equals("") || baujahr.equals("") || farbe.equals("") || preis1.equals("")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug konnte aufgrund fehlender Eingabe \nnicht angelegt werden!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            } else {
                double preis = Double.parseDouble(preis1);
                db.fzgAnlegenBoot(marke, modell, baujahr, farbe, preis);
                addFzgAgain();
            }
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der Eingabe...\nFahrzeug wurde nicht angelegt!");
        }

    }
    public static void addFahrzeugMotorrad(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug hinzufügen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte Marke eingeben:");
        sc.nextLine();
        String marke = sc.nextLine();
        System.out.println("Bitte Modell eingeben:");
        String modell = sc.nextLine();
        System.out.println("Bitte Baujahr eingeben:");
        String baujahr = sc.nextLine();
        System.out.println("Bitte Farbe eingeben:");
        String farbe = sc.nextLine();
        System.out.println("Bitte Preis eingeben:");
        String preis1 = sc.nextLine();

        try {
            if (marke.equals("") || modell.equals("") || baujahr.equals("") || farbe.equals("") || preis1.equals("")) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Fahrzeug konnte aufgrund fehlender Eingabe \nnicht angelegt werden!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            } else {
                double preis = Double.parseDouble(preis1);
                db.fzgAnlegenMotorrad(marke, modell, baujahr, farbe, preis);
                addFzgAgain();
            }
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der Eingabe...\nFahrzeug wurde nicht angelegt!");
        }

    }
    public static void addFzgAgain(){
        System.out.println("=======================================================");
        System.out.println("Fahrzeug wurde angelegt!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Möchten Sie ein weiteres Fahrzeug anlegen? J / N");
        String inputFzgAgain = sc.next().toUpperCase();
        if(inputFzgAgain.equals("J")){
            fzgAnlegen();
        }
        else if(inputFzgAgain.equals("N")){
            //hauptMenue();
        }
        else{
            System.out.println("Fehlerhafte Eingabe bei erneutem Fahrzeug anlegen!");
            //hauptMenue();
        }
    }

    // ###### Fahrzeug bearbeiten ######
    public static void fzgBearbeiten(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug bearbeiten!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Alle vorhandenen Fahrzeuge:");
        db.fzgBearbeitenInfo();
        System.out.println("=======================================================");
        System.out.println("Möchten Sie ein Fahrzeug bearbeiten? J / N");
        String del = sc.next().toUpperCase();
        if(del.equals("J")) {
            System.out.println("=======================================================");
            System.out.println("Bitte zu bearbeitende ID eingeben:");
            String idNr1 = sc.next();
            try {
                System.out.println("Ist die ID " + idNr1 + " das zu bearbeitende Fahrzeug? J / N");
                String delReal = sc.next().toUpperCase();
                if (delReal.equals("J")) {
                    int idNr = Integer.parseInt(idNr1);
                    db.fzgBearbeiten(idNr);
                    //hauptMenue();
                } else if (delReal.equals("N")) {
                    fzgBearbeiten();
                }
            } catch (NumberFormatException e) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Tipfehler bei ID Eingabe!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            }
        }
        else if(del.equals("N")){
            //hauptMenue();
        }
        else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler im Bearbeitungsmenü!");
            System.out.println("-------------------------------------------------------");
            //hauptMenue();
        }
    }

    // ###### Fahrzeug suchen ######
    public static void suche(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug suchen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("1) Suche nach Kriterien");
        System.out.println("2) Suche nach Eigenschaften");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte wählen:");
        String lookFor = sc.next();
        if(lookFor.equals("1")){
            suchMenu();
        }
        else if(lookFor.equals("2")){
            fzgSuchen();
        }
        else{
            System.out.println("Tipfehler im Suchmenü!");
            //hauptMenue();
        }
    }

    // ------ suche nach Kriterien ------
    public static void suchAuswahl(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug suchen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Wonach möchten Sie suchen?");
        System.out.println("\t1) ID");
        System.out.println("\t2) Fahrzeugtyp");
        System.out.println("\t3) Marke");
        System.out.println("\t4) Modell");
        System.out.println("\t5) Baujahr");
        System.out.println("\t6) Farbe");
        System.out.println("\t7) Preis");
    }
    public static void suchMenu(){
        suchAuswahl();
        String searchInput = sc.next();

        if(searchInput.equals("1")) {
            suchId();
            //hauptMenue();
        }
        else if(searchInput.equals("2")){
            suchFzgTyp();
            //hauptMenue();
        }
        else if(searchInput.equals("3")) {
            suchMarke();
            //hauptMenue();
        }
        else if(searchInput.equals("4")) {
            suchModell();
            //hauptMenue();
        }
        else if(searchInput.equals("5")) {
            suchBaujahr();
            //hauptMenue();
        }
        else if(searchInput.equals("6")) {
            suchFarbe();
            //hauptMenue();
        }
        else if(searchInput.equals("7")) {
            suchPreis();
            //hauptMenue();
        }
        else{
            System.out.println("=======================================================");
            System.out.println("Tipfehler in der Suche!");
            suchMenu();
        }
    }
    public static void suchId(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchende ID eingeben:");
        String idNr1 = sc.next();
        try {
            int idNr = Integer.parseInt(idNr1);
            db.fzgSuchen(idNr);
            suchAgain();
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der ID Sucheingabe!");
            System.out.println("-------------------------------------------------------");
            suchAgain();
        }
    }
    public static void suchFzgTyp(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchenden Fahrzeugtyp eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        String fzgTyp = sc.next();
        db.fzgSuchenTyp(fzgTyp);
        suchAgain();
    }
    public static void suchMarke(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchende Marke eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        sc.nextLine();
        String marke = sc.nextLine();
        db.fzgSuchenMarke(marke);
        suchAgain();
    }
    public static void suchModell(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchendes Modell eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        sc.nextLine();
        String modell = sc.nextLine();
        db.fzgSuchenModell(modell);
        suchAgain();
    }
    public static void suchBaujahr(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchendes Baujahr eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        String baujahr = sc.next();
        db.fzgSuchenBaujahr(baujahr);
        suchAgain();
    }
    public static void suchFarbe(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchende Farbe eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        sc.nextLine();
        String farbe = sc.nextLine();
        db.fzgSuchenFarbe(farbe);
        suchAgain();
    }
    public static void suchPreis(){
        System.out.println("=======================================================");
        System.out.println("Bitte zu suchenden Preis eingeben:");
        String preis1 = sc.next();
        try {
            double preis = Double.parseDouble(preis1);
            db.fzgSuchen(preis);
            suchAgain();
        }catch(NumberFormatException e){
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler bei der Preis Sucheingabe!");
            System.out.println("-------------------------------------------------------");
            suchAgain();
        }
    }
    public static void suchAgain(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Möchten Sie erneut suchen? J / N");
        String inputAgain = sc.next().toUpperCase();
        if(inputAgain.equals("J")){suchMenu();
        }
        else if(inputAgain.equals("N")){
            //hauptMenue();
        }
        else{
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler in wiederholter Suche!");
            System.out.println("-------------------------------------------------------");
            suchAgain();
        }

    }

    // ------ suche nach Eigenschaften ------
    public static void fzgSuchen(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug suchen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Bitte zu suchende Eigenschaft eingeben:");
        System.out.println("(Auf richtige Schreibweise achten!)");
        sc.nextLine();
        String eigenschaft = sc.nextLine();
        db.fzgSuchen(eigenschaft);
        suchAgainEigenschaften();
    }
    public static void suchAgainEigenschaften(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Möchten Sie erneut suchen? J / N");
        String inputAgain = sc.next().toUpperCase();
        if(inputAgain.equals("J")){
            fzgSuchen();
        }
        else if(inputAgain.equals("N")){
            //hauptMenue();
        }
        else{
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler in wiederholter Suche!");
            System.out.println("-------------------------------------------------------");
            suchAgainEigenschaften();
        }

    }

    // ###### Fahrzeug löschen ######
    public static void delFahrzeug(){
        System.out.println("=======================================================");
        System.out.println("                Fahrzeug löschen!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Alle vorhandenen Fahrzeuge:");
        db.fzgLoeschenInfo();
        System.out.println("=======================================================");
        System.out.println("Möchten Sie ein Fahrzeug Löschen? J / N");
        String del = sc.next().toUpperCase();
        if(del.equals("J")) {
            System.out.println("=======================================================");
            System.out.println("Bitte zu löschende ID eingeben:");
            String idNr1 = sc.next();
            try {
                System.out.println("-------------------------------------------------------");
                System.out.println("Ist die ID " + idNr1 + " das zu löschende Fahrzeug? J / N");
                String delReal = sc.next().toUpperCase();
                if (delReal.equals("J")) {
                    int idNr = Integer.parseInt(idNr1);
                    db.fzgLoeschen(idNr);
                    //hauptMenue();
                } else if (delReal.equals("N")) {
                    //hauptMenue();
                }
            } catch (NumberFormatException e) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Tipfehler bei ID Löscheingabe!");
                System.out.println("-------------------------------------------------------");
                //hauptMenue();
            }
        }
        else if(del.equals("N")){
            //hauptMenue();
        }
        else {
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler im Löschmenü!");
            System.out.println("-------------------------------------------------------");
            //hauptMenue();
        }
    }

    // ###### Börse beenden ######
    public static void boerseBeenden(){
        System.out.println("-------------------------------------------------------");
        System.out.println("Möchten Sie die Börse wirklich beenden? J / N");
        String quit = sc.next().toUpperCase();
        if(quit.equals("J")){
            System.out.println("=======================================================");
            System.out.println("Und tschüss... !");
            System.out.println("=======================================================");
        }
        else if(quit.equals("N")){
            System.out.println("=======================================================");
            System.out.println("Hehe...");
            hauptMenue();
        }
        else{
            System.out.println("-------------------------------------------------------");
            System.out.println("Tipfehler im Beenden Menü!");
            System.out.println("-------------------------------------------------------");
            boerseBeenden();
        }
    }

    // ###### Dummys erzeugen ######
    public static void addDummys(){
        db.fzgAnlegenPkw("Honda", "Accord", "2010", "Rot", 10000);
        db.fzgAnlegenPkw("VW", "Vento", "1998", "Weinrot", 10000);
        db.fzgAnlegenLkw("Mercedes", "Benz", "2010", "Weiß", 20000);
        db.fzgAnlegenLkw("Renault", "Monster", "2008", "Blau", 16050);
        db.fzgAnlegenBoot("Speedy", "Speedstar", "2004", "Black", 23000);
        db.fzgAnlegenBoot("Yacht", "MoneyMoney", "2020", "Weiß", 120300);
        db.fzgAnlegenMotorrad("Kawasaki", "Ninja", "2015", "Grün", 12800);
        db.fzgAnlegenMotorrad("Harlay", "Shopper", "1968", "Braun", 32040);
    }
}
