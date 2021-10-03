public class Terminal {
    //Deklaration der Klassenvariablen
    String _name;
    Airline _airline;

    //Setter
    public void setAirline(Airline airline) {
        this._airline = airline;
    }
    public void setName(String name) {
        this._name = name;
    }

    //Getter
    public Airline getAirline() {
        return _airline;
    }
    public String getName() {
        return _name;
    }
}
