/*
 * Orianne GUESDON 
 * 13/10/2023
 * TP2 Exercice 4
 */
package tp2_relation_1_guesdon;

/**
 *
 * @author ogues
 */
public class TP2_relation_1_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles "+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneMicra);
        System.out.println("la premiere voiture de Bob est " + bob.liste_voitures[0] ) ;
    }
}    
