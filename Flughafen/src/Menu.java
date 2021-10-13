//Import für Datentyp Scanner
import java.util.Scanner;

public class Menu {
    //Dekklaration Scanner
    Scanner _scanner;
    
    //Menu Constructor
    public Menu(){
        this.setScanner(new Scanner(System.in));
    }
    //Getter für Scanner
    public Scanner getScanner(){
        return _scanner;
    }
    //Setter für Scanner
    public void setScanner(Scanner _scanner){
        this._scanner = _scanner;
    }
    //Menu Methode
    public void startMenu(){
        System.out.println("Wilkommen im Menu!");
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neues Objekt hinzufügen");
        System.out.println("(2) Flug");
        System.out.println("(3) Aktuelle Objekte ausgeben");
        //Methodenvariable = choice. Eingabe wird zwischengespeichert in Variable Choice
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        if(choice.equals("1")){
            System.out.println("Bitte wähle das hinzuzufügende Objekt aus: ");
            System.out.println("(1) Airline");
            System.out.println("(2) Bahn");
            System.out.println("(3) Flughafen");
            System.out.println("(4) Fluglinie");
            System.out.println("(5) Flugzeug");
            System.out.println("(6) Passagier");
            System.out.println("(7) Pilot");
            System.out.println("(8) Terminal");
            String choice1 = getScanner().nextLine();
            System.out.println("Deine Auswahl ist: " + choice1);
            
            if(choice1.equals("1")){
                createAirlineMenu();
            }
            else if(choice1.equals("2")){
                createBahnMenu();
            }
            else if(choice1.equals("3")){
                createFlughafenMenu();
            }
            else if(choice1.equals("4")){
                createFluglinieMenu();
            }
            else if(choice1.equals("5")){
                createFlugzeugMenu();
            }
            else if(choice1.equals("6")){
                createPassagierMenu();
            }
            else if(choice1.equals("7")){
                createPilotMenu();
            }
            else if(choice1.equals("8")){
                createTerminalMenu();
            }
            else{
                System.out.println("Bitte wählen Sie eine der obigen Optionen aus.");
            }
        }
        else if(choice.equals("2")){
            //Wahrhscheinlich hier der falsche Ansatz, komme aber nicht darauf wie man das ohne eine Klasse realisieren kann.
            createPilotMenu();
            createFluglinieMenu();
            createPassagierMenu();
            createBahnMenu();
            //Startzeit und maxPassagier-Check fehlt!

            
        }
        else if(choice.equals("3")){
            System.out.println("Bitte wähle die auszugebenen Objekte aus: ");
            System.out.println("(1) Airline");
            System.out.println("(2) Bahn");
            System.out.println("(3) Flughafen");
            System.out.println("(4) Fluglinie");
            System.out.println("(5) Flugzeug");
            System.out.println("(6) Passagier");
            System.out.println("(7) Pilot");
            System.out.println("(8) Terminal");
            String choice3 = getScanner().nextLine();
            System.out.println("Deine Auswahl ist: " + choice3);

            if(choice3.equals("1")){
                showAirline();
            }
            else if(choice3.equals("2")){
                showBahn();
            }
            else if(choice3.equals("3")){
                showFlughafen();
            }
            else if(choice3.equals("4")){
                showFluglinie();
            }
            else if(choice3.equals("5")){
                showFlugzeug();
            }
            else if(choice3.equals("6")){
                showPassagier();
            }
            else if(choice3.equals("7")){
                showPilot();
            }
            else if(choice3.equals("8")){
                showTerminal();
            }
            else{
                System.out.println("Bitte wählen Sie eine der obigen Optionen aus.");
            }
        }
        else{
            System.out.println("Bitte wählen Sie eine der obigen Optionen aus.");
        }
        startMenu();
    }


    //CREATE METHODEN

    //Create Airline Methode
    public void createAirlineMenu(){
        System.out.println("Airline erstellen.");
        //Name
        System.out.println("Name: ");
        String airlinename = getScanner().nextLine();
        
        //Flugzeug
        int i = 0;
        System.out.println("Bitte wähle Flugzeug aus:");
        for(Flugzeug flugzeug : App.getALLFlugzeug()){
            if(flugzeug != null){
                System.out.println(i + " - " + flugzeug.getNummer() + flugzeug.getHersteller());
                i++;
            }
        }
        // Eingabe des Strings
        String flugzeug_choice = getScanner().next();
        //String in Integer umwandeln
        int flugzeug_index = Integer.valueOf(flugzeug_choice);
        //Ausgabe des Arrays! Eckige Klammern wählen das richtige Element des Arrays!
        System.out.println(App.getALLFlugzeug() [flugzeug_index]);

        //Fluglinie
        i=0;
        System.out.println("Bitte wähle Fluglinie aus:");
        for(Fluglinie fluglinie : App.getALLFluglinie()){
            if(fluglinie != null){
                System.out.println(i + " - " + fluglinie.getFluglinienname());
                i++;
            }
        }
        String fluglinie_choice = getScanner().next();
        int fluglinie_index = Integer.valueOf(fluglinie_choice);
        System.out.println(App.getALLFluglinie() [fluglinie_index]);
        
        System.out.println("Es wurde eine neue Airline eingetragen.");
        //Hinzufügen in Array
        App.addAirline(new Airline(airlinename, App.getALLFlugzeug()[flugzeug_index], App.getALLFluglinie() [fluglinie_index]));

    }

    //Create Bahn Methode
    public void createBahnMenu(){
        System.out.println("Bahn erstellen.");
        System.out.println("Name: ");
        String bahnname = getScanner().nextLine();
        System.out.println("Es wurde eine neue Bahn eingetragen.");
        App.addBahn(new Bahn(bahnname));
    }

    //Create Flughafen Methode
    public void createFlughafenMenu(){
        System.out.println("Flughafen erstellen.");
        System.out.println("Name: ");
        String flughafennname = getScanner().nextLine();
        System.out.println("Standort: ");
        String flughafenstandort = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Flughafen eingetragen.");
        App.addFlughafen(new Flughafen(flughafennname, flughafenstandort));
    }

    //Create Fluglinie Methode
    public void createFluglinieMenu(){
        System.out.println("Fluglinie erstellen.");
        System.out.println("Name: ");
        String fluglinienname = getScanner().nextLine();
        
        //Airline
        int i = 0;
        System.out.println("Bitte wähle Airline aus:");
        for(Airline airline : App.getALLAirline()){
            if(airline != null){
                System.out.println(i + " - " + airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().next();
        int airline_index = Integer.valueOf(airline_choice);
        System.out.println(App.getALLAirline() [airline_index]);
        System.out.println("Es wurde eine neue Fluglinie eingetragen.");
        App.addFluglinie(new Fluglinie(fluglinienname, App.getALLAirline() [airline_index]));
    }

    //Create Flugzeug Methode
    public void createFlugzeugMenu(){
        System.out.println("Flugzeug erstellen.");
        System.out.println("Nummer: ");
        String flugzeugnummer = getScanner().nextLine();
        System.out.println("Hersteller: ");
        String flugzeughersteller = getScanner().nextLine();
        System.out.println("Maximale Passagieranzahl: ");
        String flugzeugmaximalepassagiere_choice = getScanner().nextLine();
        int flugzeugmaximalepassagiere = Integer.valueOf(flugzeugmaximalepassagiere_choice);
        System.out.println("Maximale Pilotenanzahl: ");
        String flugzeugmaximalepiloten_choice = getScanner().nextLine();
        int flugzeugmaximalepiloten = Integer.valueOf(flugzeugmaximalepiloten_choice);
        //Airline
        int i = 0;
        System.out.println("Bitte wähle Airline aus:");
        for(Airline airline : App.getALLAirline()){
            if(airline != null){
                System.out.println(i + " - " + airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().next();
        int airline_index = Integer.valueOf(airline_choice);
        System.out.println(App.getALLAirline() [airline_index]);
        System.out.println("Es wurde ein neues Flugzeug eingetragen.");
        App.addFlugzeug(new Flugzeug(flugzeughersteller, flugzeugnummer, App.getALLAirline() [airline_index], flugzeugmaximalepassagiere, flugzeugmaximalepiloten));

    }

    //Create Passagier Methode
    public void createPassagierMenu(){
        System.out.println("Passagier erstellen.");
        System.out.println("Vorname: ");
        String passagiervorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String passagiernachname = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Passagier eingetragen.");
        App.addPassagier(new Passagier(passagiervorname, passagiernachname));
    }
    //Create Pilot Methode
    public void createPilotMenu(){
        System.out.println("Pilot erstellen.");
        System.out.println("Vorname: ");
        String pilotvorname = getScanner().nextLine();
        System.out.println("Nachname: ");
        String pilotnachname = getScanner().nextLine();
        System.out.println("Es wurde ein neuer Pilot eingetragen.");
        App.addPilot(new Pilot(pilotvorname, pilotnachname));
    }
    //Create Terminal Methode
    public void createTerminalMenu(){
        System.out.println("Terminal erstellen.");
        System.out.println("Name: ");
        String terminalname = getScanner().nextLine();
        //Airline
        int i = 0;
        System.out.println("Bitte wähle Airline aus:");
        for(Airline airline : App.getALLAirline()){
            if(airline != null){
                System.out.println(i + " - " + airline.getName());
                i++;
            }
        }
        String airline_choice = getScanner().next();
        int airline_index = Integer.valueOf(airline_choice);
        System.out.println(App.getALLAirline() [airline_index]);
        System.out.println("Es wurde ein neues Terminal eingetragen.");
        App.addTerminal(new Terminal(terminalname, App.getALLAirline() [airline_index]));
        

    }
    //CREATE METHODEN ENDE

    //SHOW METHODEN
    
    //Show Airline Methode
    public void showAirline(){
        for (Airline airline : App.getALLAirline()){
            if(airline != null){
                System.out.println("Airline: " + airline.getName() + " Flugzeug: " + airline.getFlugzeug().getNummer() + " " + airline.getFlugzeug().getHersteller() + " Fluglinie: " + airline.getFluglinie().getFluglinienname());
            }
        }
    }
    //Show Bahn Methode
    public void showBahn(){
        for (Bahn bahn : App.getALLBahn()){
            if(bahn != null){
                System.out.println(bahn.getName());
            }
        }
    }
    //Show Flughafen Methode
    public void showFlughafen(){
        for (Flughafen flughafen : App.getALLFlughafen()){
            if(flughafen != null){
                System.out.println(flughafen.getName() + " " + flughafen.getStandort());
            }
        }
    }
    //Show Fluglinie Methode
    public void showFluglinie(){
        for (Fluglinie fluglinie : App.getALLFluglinie()){
            if(fluglinie != null){
                System.out.println(fluglinie.getFluglinienname() + " " + fluglinie.getName().getName());
            }
        }
    }
    //Show Flugzeug Methode
    public void showFlugzeug(){
        for (Flugzeug flugzeug : App.getALLFlugzeug()){
            if (flugzeug != null){
                System.out.println(flugzeug.getHersteller() + " " + flugzeug.getNummer() + " " + flugzeug.getName().getName());
            }
        }
    }
    //Show Passagier Methode
    public void showPassagier(){
        for (Passagier passagier : App.getALLPassagier()){
            if (passagier != null){
                System.out.println(passagier.getVorname() + " " + passagier.getNachname());
            }
        }
    }
    //Show Pilot Methode
    public void showPilot(){
        for (Pilot pilot : App.getALLPilot()){
            if (pilot != null){
                System.out.println(pilot.getVorname() + " " + pilot.getNachname());
            }
        }
    }
    //Show Terminal Methode
    public void showTerminal(){
        for (Terminal terminal : App.getALLTerminal()){
            if (terminal != null){
                System.out.println(terminal.getName() + terminal.getAirline().getName());
            }
        }
    }


}
