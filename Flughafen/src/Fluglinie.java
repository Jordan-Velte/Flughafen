public class Fluglinie {
    //Deklaration der Klassenvariablen
    String _fluglinienname;
    Airline _name;

    //Setter
    public void setFlugliniename(String fluglinienname) {
        this._fluglinienname = fluglinienname;
    }
    public void setName(Airline name) {
        this._name = name;
    }

    //Getter
    public String getFlugliniename() {
        return _fluglinienname;
    }
    public Airline getName() {
        return _name;
    }
}
