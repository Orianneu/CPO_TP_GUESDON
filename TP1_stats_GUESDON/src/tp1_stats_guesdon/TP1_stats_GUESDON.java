/*
 * TP0 Exercice 2
 * Orianne GUESDON
 * 18 Septembre 2023
 */
package tp1_stats_guesdon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class TP1_stats_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tableau = new int[6]; //tableau de 6 entiers
        Scanner scanner = new Scanner(System.in); //saisie de l'entier m
        System.out.print("Saisir un nombre entier m : ");
        Random generateurAleat = new Random();
        int m = scanner.nextInt(); //m devient un entier

        for (int i = 0; i < m; i++) {
            int lancerde = generateurAleat.nextInt(6); // Tirer un nombre aléatoire entre 0 et 5 inclus
            tableau[lancerde]++;
        }
        
        System.out.println("Résultat obtenu : "); //affichage de la ligne "resultat obtenu" avant les pourcentages
        for (int i=0;i<6;i++) {
            double pourcentage = ((double) tableau[i]/m)*100; //passage en pourcentage des valeurs du tableau
            System.out.println("Face "+(i+1)+" : "+pourcentage+"%"); //affichage du résultat final
        }
    
    }
    
}
