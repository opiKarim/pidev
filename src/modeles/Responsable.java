package modeles;

public class Responsable extends User {
    private String universite;

    public Responsable() {
        super();
    }

    public Responsable(int id, String nom, String prenom, int phone, String email, String pwd, String carte_banq,
            String universite) {
        super(id, nom, prenom, phone, email, pwd, carte_banq);
        this.universite = universite;
    }

    @Override
    public String toString() {
        return "{" +
                " universite='" + getUniversite() + "'" +
                "}";
    }

    public String getUniversite() {
        return this.universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

}
