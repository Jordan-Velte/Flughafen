public class Flug {
    Flugzeug _flugzeug;
    Fluglinie _fluglinie;
    Bahn _bahn;
    Passagier[] _passagier;
    Pilot[] _pilot;
    String _startzeit;

    public Flug(Flugzeug flugzeug, Fluglinie fluglinie, Bahn bahn, Passagier[] passagier, Pilot[] pilot, String startzeit){
        setFlugzeug(flugzeug);
        setBahn(bahn);
        setFluglinie(fluglinie);
        setPassagier(passagier);
        setPilot(pilot);
        setStartzeit(startzeit);
    }

    //Muss noch!
    public void addPassagier(Passagier passagier){
        _passagier[0] = passagier;
    }

    public void setBahn(Bahn bahn) {
        this._bahn = bahn;
    }
    public void setFluglinie(Fluglinie fluglinie) {
        this._fluglinie = fluglinie;
    }
    public void setFlugzeug(Flugzeug flugzeug) {
        this._flugzeug = flugzeug;
    }
    public void setPassagier(Passagier[] passagier) {
        this._passagier = passagier;
    }
    public void setPilot(Pilot[] pilot) {
        this._pilot = pilot;
    }
    public void setStartzeit(String startzeit) {
        this._startzeit = startzeit;
    }

    public Bahn getBahn() {
        return _bahn;
    }
    public Fluglinie getFluglinie() {
        return _fluglinie;
    }
    public Flugzeug getFlugzeug() {
        return _flugzeug;
    }
    public Passagier[] getPpassagier() {
        return _passagier;
    }
    public Pilot[] getPilot() {
        return _pilot;
    }
    public String getStartzeit() {
        return _startzeit;
    }


}