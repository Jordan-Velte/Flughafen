public class Flughafen {
    //Deklaration der Klassenvariablen
    String _name;
    String _standort;

    //Constructor
    public Flughafen(String name, String standort){
        this.setName(name);
        this.setStandort(standort);
    }

    //Setter
    public void setName(String name) {
        this._name = name;
    }
    public void setStandort(String standort) {
        this._standort = standort;
    }

    //Getter
    public String getName() {
        return _name;
    }
    public String getStandort() {
        return _standort;
    }
}
