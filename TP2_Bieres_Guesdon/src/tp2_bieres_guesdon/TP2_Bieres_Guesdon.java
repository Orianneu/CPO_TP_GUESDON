/*
 * Orianne GUESDON
 * TP2
 * 06/10/2023
 */
package tp2_bieres_guesdon;

/**
 *
 * @author ogues
 */
public class TP2_Bieres_Guesdon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ; //création d'un objet de classe BouteilleBiere
        uneBiere.lireEtiquette(); //Utilisation de la méthode lireEtiquette qui va afficher les données de la bouteilles
        uneBiere.Décapsuler(); //Utilisation de la méthode Décapsuler qui va vérifier si la biere est deja ouverte, si non, elle l'ouvre.

        BouteilleBiere uneBiere2 = new BouteilleBiere("Biere 2", 8.0 ,"Brasserie1") ;
        uneBiere2.lireEtiquette();
        uneBiere2.Décapsuler();

        BouteilleBiere uneBiere3 = new BouteilleBiere("Biere 3", 7.6 ,"Brasserie2") ;
        uneBiere3.lireEtiquette();
        uneBiere3.Décapsuler(); //on ouvre la biere
        uneBiere3.Décapsuler(); //on teste si il y a renvoie de "La biere est déjà ouverte"
       
        BouteilleBiere uneBiere4 = new BouteilleBiere("Biere 4", 6.6 ,"Brasserie3") ;
        uneBiere4.lireEtiquette();
        uneBiere4.Décapsuler(); //on ouvre la biere
        uneBiere4.Décapsuler(); //on teste si il y a renvoie de "La biere est déjà ouverte"

        

    }
    
}
