import javax.sql.rowset.serial.SQLOutputImpl;

public class Voiture {

    int nbPortes = 5;
    boolean automatique;
    String couleur;
    int rapportCourant;

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
        System.out.println("La voiture tourne vers la " + droiteOuGauche+ " d'un angle de " + angle);
    }

}
