import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a3ca43c4-53e6-434c-9551-a9f65b05a7dc")
public class Gestionnaire extends utilisateur {
    @objid ("e749c7da-81c9-40da-afef-4f24b9acf105")
    public String idGest;

    @objid ("f3681bf2-b0ee-4229-99f6-8c5f82964326")
    public List<partieRésidence> gérer = new ArrayList<partieRésidence> ();

    @objid ("4a9a37f3-ab65-4865-935e-ad8c10886034")
    public Résidence gérer;

    @objid ("34dc2dea-97b0-4753-862b-405279db09de")
    public void validerAvis() {
    }

    @objid ("ca296413-e430-417a-a1af-29ac1905f01d")
    public void gererdispo() {
    }

}
