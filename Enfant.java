package TechStore;

public class Enfant extends Personne {
    private String nomEcole;

    public Enfant(String nom, int age, String telephone, String nomEcole) {
        super(nom, age, telephone);
        this.nomEcole = nomEcole;
    }

    @Override
    public String toString() {
        return super.toString() + ", école: " + nomEcole;
    }
}