public class Flugzeug {
    //Deklaration der Klassenvariablen
    String _nummer;
    String _hersteller;
    Airline _name;
    int _maxPassagiere;
    int _maxPiloten;

    //Setter
    public void setNummer(String nummer) {
        this._nummer = nummer;
    }
    public void setHersteller(String hersteller) {
        this._hersteller = hersteller;
    }
    public void setName(Airline name) {
        this._name = name;
    }
    public void setMaxPassagiere(int maxPassagiere) {
        this._maxPassagiere = maxPassagiere;
    }
    public void setMaxPiloten(int maxPiloten) {
        this._maxPiloten = maxPiloten;
    }

    //Getter
    public String getNummer() {
        return _nummer;
    }
    public String getHersteller() {
        return _hersteller;
    }
    public Airline getName() {
        return _name;
    }
    public int getMaxPassagiere() {
        return _maxPassagiere;
    }
    public int getMaxPiloten() {
        return _maxPiloten;
    }
}
