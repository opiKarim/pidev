package modeles;

public class Recruteur extends User {
    private String societe;

    public Recruteur() {
        super();
    }

    public Recruteur(int id, String nom, String prenom, int phone, String email, String pwd, String carte_banq,
            String societe) {
        super(id, nom, prenom, phone, email, pwd, carte_banq);
        this.societe = societe;
    }

    @Override
    public String toString() {
        return "{" +
                " societe='" + getsociete() + "'" +
                "}";
    }

    public String getsociete() {
        return this.societe;
    }

    public void setsociete(String societe) {
        this.societe = societe;
    }

}
