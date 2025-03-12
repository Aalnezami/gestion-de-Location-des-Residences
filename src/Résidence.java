import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c782923f-7186-483d-b52f-56eca4b57bfb")
public class Résidence {
    @objid ("f90aa4b2-da34-44dd-b2c1-ceed28279718")
    public String idRes;

    @objid ("916dbffb-8268-408b-9d93-b6d3826932a9")
    public String adresse;

    @objid ("b6cd8569-bf8d-4f9f-aae1-25b90db0b7d1")
    public List<Avis> appartenir = new ArrayList<Avis> ();

    @objid ("4b093f69-5d76-4509-911a-3481c36f2638")
    public void disponible() {
    }

    @objid ("1464c943-2bbd-47ee-a737-f3ac5ecda9f9")
    public void tarif() {
    }

}
