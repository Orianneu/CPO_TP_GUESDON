/*
 * Orianne GUESDON
 * TP2
 * 13/10/2023
 */
package tp2_manip_guesdon;

/**
 *
 * @author ogues
 */
public class TP2_manip_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500); //création tartiflette 1
        Tartiflette assiette2 = new Tartiflette(600); //création tartiflette 2
        Tartiflette assiette3 = assiette2; //création tartiflette 3 qui est pareille que la 2
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories); //affichage calories
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        Tartiflette change = assiette1; //assiette1 et assiette2 intervertissent les objets de type Tartiflette qu’elles référencent
        assiette1 = assiette2;
        assiette2 = change;
        
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        
        Moussaka assiette666 = new Moussaka(700); //correcte
        // Moussaka assiette667 = new Tartiflette(800); //marcherais si tartiflette serait une sous classe de moussaka

        Moussaka[] tableau = new Moussaka[10]; //tableau de 10 refs de moussaka
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = new Moussaka(i * 100);
        }
    }
}