public class Pilot {
    //Deklaration der Klassenvariablen
    String _vorname;
    String _nachname;
    
    //Constructor
    public Pilot(String vorname, String nachname){
        this.setVorname(vorname);
        this.setNachname(nachname);
    }

    //Setter
    public void setVorname(String vorname) {
        this._vorname = vorname;
    }
    public void setNachname(String nachname) {
        this._nachname = nachname;
    }

    //Getter
    public String getVorname() {
        return _vorname;
    }
    public String getNachname() {
        return _nachname;
    }
}
