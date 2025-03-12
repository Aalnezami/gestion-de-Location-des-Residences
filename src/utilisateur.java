import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("fb93abbe-4dbb-405f-9a1e-ac2cbf337b6e")
public class utilisateur {
    @objid ("f6ec29b5-9e2f-4655-a419-fbc6c2ff67a6")
    public String idUser;

    @objid ("c6a4112b-d991-4ff7-bd54-577445b09096")
    public String nom prénom;

    @objid ("32f8209e-7e34-4d69-8a1d-dc4f055a7e3c")
    public String email;

    @objid ("39e6d40f-573e-417d-9886-472d4873a1cc")
    public List<partieRésidence> réserver = new ArrayList<partieRésidence> ();

    @objid ("c68747db-031c-4f11-b72a-34fa6fc1a98c")
    public List<Réservation> avoir = new ArrayList<Réservation> ();

    @objid ("e05d1e5e-10b0-40e6-abb9-05723021b8db")
    public List<Avis> appartenir = new ArrayList<Avis> ();

    @objid ("07e41a1f-8486-4d36-a028-b42d4e075ebd")
    public void reserver() {
    }

    @objid ("f2f3d11b-60ea-4094-8511-2dcd3a1cf475")
    public void laisserAvis() {
    }

}
