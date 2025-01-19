public class HelloWorld {
    public static void main (String... args){

        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatique = true;
        voitureDeMichel.couleur ="verte";

        System.out.println("La voiture est" + voitureDeMichel.couleur+"elle a" + voitureDeMichel.nbPortes + "portes");

        voitureDeMichel.klaxonner();

        int nouvelleVitesse = voitureDeMichel.accellrer();
        System.out.println("La vitesse de la voiture est de :" + nouvelleVitesse   );

        int nouveauRapport = voitureDeMichel.passerRpport(true);
        System.out.println("Le rapport est de :" + nouveauRapport);

        voitureDeMichel.tounrner(false, 45);
    }
}
