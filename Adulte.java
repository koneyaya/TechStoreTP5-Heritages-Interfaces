 package TechStore;

public class Adulte extends Personne implements Identifiable {
    private String profession;

    public Adulte(String nom, int age, String telephone, String profession) {
        super(nom, age, telephone);
        this.profession = profession;
    }

    @Override
    public void afficherIdentite() {
        System.out.println("Adulte : " + getNom());
    }

    @Override
    public String toString() {
        return super.toString() + ", profession: " + profession;
    }
}