public class Voiture {

    int nbPortes = 5;
    static int nbroue = 4;
    boolean automatique;
    String couleur;
    int rapportCourant;
    Moteur moteur;



    void klaxonner (){
        System.out.println("Tutut!");
    }

    int accellrer () {
        System.out.println("J'accelère");
        return 100;
    }

    int passerRpport(boolean augumenter){
        if (augumenter){
            rapportCourant++;
        }
        else{
            rapportCourant--;
        }
        return rapportCourant;
    }

    void tounrner(boolean droite, int angle){
        String droiteOuGauche = null;

        if (droite){
            droiteOuGauche = "droite";
        }
        else{
            droiteOuGauche = "gauche";
        }
        System.out.println("La voiture tourne vers la " + droiteOuGauche+ " d'un angle de " + angle);
    }

    Ville transporter (Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager nommé : "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est pasrtie de la ville de "+ villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Schelter";
        return villeDeDestination;
    }

}
