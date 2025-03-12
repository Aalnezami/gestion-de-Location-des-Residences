import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("e4f9e283-3565-4543-9a7b-c35c4d4ec054")
public class Réservation {
    @objid ("1a5bcdc6-4817-4bb6-9264-6d89250d1fa8")
    public String idReserv;

    @objid ("4b864ff0-5208-4159-97db-02e06499536a")
    public List<partieRésidence> appartenir = new ArrayList<partieRésidence> ();

    @objid ("f0bdc1c3-6737-4ac6-aa6d-90ed5dfb56cf")
    public List<paiement> contenir = new ArrayList<paiement> ();

    @objid ("d28fbd39-b604-4cc0-9037-55b037eebef5")
    public void annuler() {
    }

    @objid ("8f4b10b4-b08b-47dc-99d3-c79d0be23ea8")
    public void modifier() {
    }

    @objid ("0644b41b-1182-4220-8e1e-86b34d80adfb")
    public void confirmer() {
    }

}
