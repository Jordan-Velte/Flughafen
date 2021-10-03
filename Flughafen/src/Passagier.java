public class Passagier {
    //Deklaration der Klassenvariablen
    String _vorname;
    String _nachname;

    //Setter
    public void set_vorname(String vorname) {
        this._vorname = vorname;
    }
    public void set_nachname(String nachname) {
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
