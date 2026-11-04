 package TechStore;

public class Personne {
    private String nom;
    private int age;
    private String telephone; // Ajout demandé dans la question 19

    public Personne(String nom, int age, String telephone) {
        this.nom = nom;
        this.age = age;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() { // Getter demandé dans la question 19
        return telephone;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", âge: " + age + ", téléphone: " + telephone;
    }
}