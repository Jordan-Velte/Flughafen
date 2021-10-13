//import
import java.util.Scanner;

public class App {
    
    //Übernommen aus Autohaus
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a :array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i = i+1;
        }
    } 
    //Deklaration Arrays
    static Airline[] _airline;
    static Bahn[] _bahn;
    static Flughafen[] _flughafen;
    static Fluglinie[] _fluglinie;
    static Flugzeug[] _flugzeug;
    static Passagier[] _passagier;
    static Pilot[] _pilot;
    static Terminal[] _terminal;

    //Rückgabemethode --> Arrays vom jeweiligen Typen werden zurückgegeben
    public static Airline[] getALLAirline(){
        return _airline;
    }
    public static Bahn[] getALLBahn(){
        return _bahn;
    }
    public static Flughafen[] getALLFlughafen(){
        return _flughafen;
    }
    public static Fluglinie[] getALLFluglinie(){
        return _fluglinie;
    }
    public static Flugzeug[] getALLFlugzeug(){
        return _flugzeug;
    }
    public static Passagier[] getALLPassagier(){
        return _passagier;
    }
    public static Pilot[] getALLPilot(){
        return _pilot;
    }
    public static Terminal[] getALLTerminal(){
        return _terminal;
    }

    //Mit AddObject Methode
    public static void addAirline(Airline airline){
        addObject(airline, getALLAirline());
    }
    public static void addBahn(Bahn bahn){
        addObject(bahn, getALLBahn());
    }
    public static void addFlughafen(Flughafen flughafen){
        addObject(flughafen, getALLFlughafen());
    }
    public static void addFluglinie(Fluglinie fluglinie){
        addObject(fluglinie, getALLFluglinie());
    }
    public static void addFlugzeug(Flugzeug flugzeug){
        addObject(flugzeug, getALLFlugzeug());
    }
    public static void addPassagier(Passagier passagier){
        addObject(passagier, getALLPassagier());
    }
    public static void addPilot(Pilot pilot){
        addObject(pilot, getALLPilot());
    }
    public static void addTerminal(Terminal terminal){
        addObject(terminal, getALLTerminal());
    }



    //Main-Methode als Einstiegspunkt des Programms
    public static void main(String[] args) throws Exception {
        /*Printout test
        System.out.println("Hallo, liebe Informatiker!");
        System.out.println("Hallo, liebe Informatiker!");
        */
        
        //Demodaten Anfang
        //Deklaration der Länge der Arrays
        _airline = new Airline[30];
        //Initialisierung der einzelnen Indizes des Arrays
        _airline [0] = new Airline("Lufthansa", _flugzeug[0], _fluglinie[0]);
        _airline [1] = new Airline("Air France", _flugzeug[1], _fluglinie[1]);
        _airline [2] = new Airline("British Airways", _flugzeug[2], _fluglinie[2]);
        _airline [3] = new Airline("United Airlines", _flugzeug[3], _fluglinie[3]);
        _airline [4] = new Airline("Ryanair", _flugzeug[4], _fluglinie[4]);

        _bahn = new Bahn[5];
        _bahn [0] = new Bahn("27L");
        _bahn [1] = new Bahn("9R");

        _flughafen = new Flughafen[5];
        _flughafen[0] = new Flughafen("Flughafen Königsdorf", "Königsdorf");

        _fluglinie = new Fluglinie[30];
        _fluglinie[0] = new Fluglinie("HAM-FRA", _airline[0]);
        _fluglinie[1] = new Fluglinie("HAM-CDG", _airline[1]);
        _fluglinie[2] = new Fluglinie("HAM-LHR", _airline[2]);
        _fluglinie[3] = new Fluglinie("HAM-EWR", _airline[3]);
        _fluglinie[4] = new Fluglinie("HAM-APG", _airline[4]);

        _pilot = new Pilot[30];
        _pilot[0] = new Pilot("Heinrich", "Peters");
        _pilot[1] = new Pilot("Gustav", "Müller");
        _pilot[2] = new Pilot("Siegfried", "Ampel");
        _pilot[3] = new Pilot("Jordan", "Velte");
        _pilot[4] = new Pilot("Sabine", "Schön");

        _flugzeug = new Flugzeug[30];
        _flugzeug [0] = new Flugzeug("Airbus", "320", _airline[0], 200, 2);
        _flugzeug [1] = new Flugzeug("Airbus", "319", _airline[1], 180, 2);
        _flugzeug [2] = new Flugzeug("Airbus", "320", _airline[2], 200, 2);
        _flugzeug [3] = new Flugzeug("Boeing", "767-300", _airline[3], 300, 2);
        _flugzeug [4] = new Flugzeug("Boeing", "737", _airline[4], 200, 2);

        _passagier = new Passagier[10000];
        _passagier[0] = new Passagier("Janine", "Friedhold");
        _passagier[1] = new Passagier("Karoline", "Liesa");
        _passagier[2] = new Passagier("Barbara", "Jessica");
        _passagier[3] = new Passagier("Tom", "Philipp");
        _passagier[4] = new Passagier("Svenja", "Falk");

        _terminal = new Terminal[2];
        _terminal[0] = new Terminal("Terminal 1", _airline[0]);
        _terminal[1] = new Terminal("Terminal 2", _airline[1]);
        
        //Neues Objekt der Klasse Menu
        Menu menu = new Menu();
        //Methode wird durch Punktnotation am Objekt aufgerufen
        menu.startMenu();
        




    }
}
