public class Fluglinie {
    //Deklaration der Klassenvariablen
    String _fluglinienname;
    Airline _name;

    //Constructor
    public Fluglinie(String fluglinienname, Airline name){
        this.setFluglinienname(fluglinienname);
        this.setName(name);
    }

    //Setter
    public void setFluglinienname(String fluglinienname) {
        this._fluglinienname = fluglinienname;
    }
    public void setName(Airline name) {
        this._name = name;
    }

    //Getter
    public String getFluglinienname() {
        return _fluglinienname;
    }
    public Airline getName() {
        return _name;
    }
}
