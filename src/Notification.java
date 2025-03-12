import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f00a5e30-2b1f-4df6-89bb-f2b6dabfb1a4")
public class Notification {
    @objid ("3b45d3c6-8d68-4390-bf21-aeba73dca098")
    public String idNotif;

    @objid ("5d58bb44-ec4d-4f7b-b925-82507d08e37b")
    public String contenu;

    @objid ("1c853ce3-e2d9-46d7-b3a9-5960514a87f9")
    public paiement appartenir;

    @objid ("8a592b17-7ad3-43d6-9506-1d2d5954a020")
    public Réservation appartenir;

    @objid ("52bee478-02e1-4135-971c-817a9d6e6a3c")
    public utilisateur appartenir;

    @objid ("5629f0d4-1c04-4eba-a0da-b361a67cb83f")
    public void envoyer() {
    }

}
