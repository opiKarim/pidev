package modeles;

public class Enseignant extends User {
    private String universite;
    private String section;
    private int niveau[];
    private Cour Cours[];

    public Enseignant() {
        super();
    }

    public Enseignant(int id_user, String nom, String prenom, int phone, String email, String pwd, String carte_banq,
            String universite , String section) {
        super(id_user, nom, prenom, phone, email, pwd, carte_banq);
        this.universite = universite;
        this.section = section;
        
    }

    public String getUniversite() {
        return this.universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
}
