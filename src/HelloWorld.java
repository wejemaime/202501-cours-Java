public class HelloWorld {
    public static void main (String... args){

        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatique = true;
        voitureDeMichel.couleur ="verte";
        Voiture voitureDeJerome = new Voiture();
        Moteur moteur = new Moteur();
        moteur.carburation = "essence";
        moteur.cylindre = 4;
        voitureDeJerome.nbPortes = 5;
        voitureDeJerome.automatique = false;
        voitureDeJerome.couleur ="bleu";

        voitureDeJerome.moteur = moteur;
        voitureDeMichel.moteur = moteur;

        Passager passager=new Passager();
        passager.nom = "Dupont";
        passager.prenom = "Leo";
        Ville auckland = new Ville();
        auckland.nom = "Auckland";
        Ville destination=voitureDeMichel.transporter (passager,auckland);
        System.out.println("Le passager est arrivé à la ville de "+ destination.nom);
    }
}
