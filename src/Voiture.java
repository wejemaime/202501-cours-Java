public class Voiture {

    int nbPortes = 5;
    boolean automatique;
    String couleur;
    Moteur moteur;

    Voiture(){
        System.out.println("une voiture par defaut est en cours de construction");
    }

    Voiture(String couleur, int nbPortes){
        this.couleur = couleur;
        System.out.println("une voiture de couleur "+couleur +" avec "+nbPortes+" est en cours de construction");
    }








    Ville transporter (Passager passager, Ville villeDeDepart){
        System.out.println("Je transporte un passager nommé : "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est pasrtie de la ville de "+ villeDeDepart.nom);

        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Schelter";
        return villeDeDestination;
    }

}
