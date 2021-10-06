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
        //Printout test
        System.out.println("Hallo, liebe Informatiker!");
        System.out.println("Hallo, liebe Informatiker!");
        
        //Demodaten Anfang
        //Deklaration der Länge der Arrays
        _airline = new Airline[20];
        //Initialisierung der einzelnen Indizes des Arrays
        _airline [0] = new Airline("Lufthansa");
        _airline [1] = new Airline("Air France");
        _airline [2] = new Airline("British Airways");
        _airline [3] = new Airline("United Airlines");
        _airline [4] = new Airline("Ryanair");

        _bahn = new Bahn[5];
        _bahn [0] = new Bahn("27L");
        _bahn [1] = new Bahn("9R");

        _flughafen = new Flughafen[1];
        _flughafen[0] = new Flughafen("Flughafen Königsdorf", "Königsdorf");

        _fluglinie = new Fluglinie[20];
        _fluglinie[0] = new Fluglinie("HAM-MUC", airline);



    }
}
