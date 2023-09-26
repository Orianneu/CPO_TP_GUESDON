/*
 * TP0 Exercice 2
 * Orianne GUESDON
 * 18 Septembre 2023
 */
package tp1_guessmynumber_guesdon;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class TP1_guessMyNumber_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //Boucle pour effectuer l'affichage de 5 nombres aléatoires
            Random generateurAleat = new Random();
            double nombre = generateurAleat.nextDouble();
            System.out.println(nombre);
        }
        
        int n = generateurAleat.nextInt(100);
        Scanner saisieUtilisateur1 = new Scanner(System.in);  //saisie du nombre par l'utilisateur
        System.out.println("Entrez une valeur : ");
        double guess = saisieUtilisateur1.nextDouble();

    }

}
