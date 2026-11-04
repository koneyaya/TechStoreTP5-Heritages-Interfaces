package TechStore;

public class TestHeritage {
    public static void main(String[] args) {
        // 1. Création des instances avec les 4 paramètres requis
        Adulte a1 = new Adulte("Amine", 35, "0612345678", "Ingénieur");
        Enfant e1 = new Enfant("Sami", 10, "0687654321", "École primaire");
        Bebe b1 = new Bebe("Lina", 1, "0600000000", true);

        // 2. Affichage des objets
        System.out.println("--- Affichage des objets ---");
        System.out.println(a1);
        System.out.println(e1);
        System.out.println(b1);

        // 3. Appel à getNom() (Question 20)
        System.out.println("\n--- Test du getter getNom() ---");
        System.out.println("Nom récupéré : " + a1.getNom());

        // 4. Test de l'interface Identifiable
        System.out.println("\n--- Test de l'interface Identifiable ---");
        a1.afficherIdentite();

        // 5. Test de l'énumération TypePersonne
        System.out.println("\n--- Test de l'énumération TypePersonne ---");
        TypePersonne type = TypePersonne.ADULTE;
        System.out.println("Valeur unique : " + type);

        System.out.println("Parcours de toutes les valeurs :");
        for (TypePersonne t : TypePersonne.values()) {
            System.out.println(t);
        }
    }
}