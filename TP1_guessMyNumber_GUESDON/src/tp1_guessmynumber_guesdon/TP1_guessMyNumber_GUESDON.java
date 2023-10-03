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
    public static void main(String[] args, boolean cauchemar) {

        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("Choisir la difficulté (1,2, 3 ou 4) : "); //Choix  difficulté
        String niveau = scanner.nextLine();

        
        int tentmax = 0;

        //tentatives pour chaque niveau de difficultés
        if (niveau=="1") {
            tentmax = 30;
        } else if (niveau=="2") {
            tentmax = 15;
        } else if (niveau=="3") {
            tentmax = 10;
        } else if (niveau=="4") {
            tentmax = 5;
            cauchemar = true;
        }

        int nombreAleatoire = generateurAleat.nextInt(101);
        int tentative = 0;

        while (tentative < tentmax) {
            System.out.println("Choisir un nombre entre 0 et 100 : "); //texte affichage
            int nombreUtilisateur = scanner.nextInt(); //rentrée de la valeur

            if (nombreUtilisateur == nombreAleatoire) { //Si le guess est bon
                System.out.println("Bravo!"); //message de victoire
                break;
            } else {
                if (cauchemar && generateurAleat.nextInt(100) < 30) { //Mode cauchemar avec 30% de fausses réponses
                    if (nombreUtilisateur < nombreAleatoire) { //si fausse réponse alos on a cette boucle if
                        System.out.println("trop grand"); 
                    } else {
                        System.out.println("trop petit");
                    }
                    
                } else {
                    if (nombreUtilisateur > nombreAleatoire) { //comparateur entre notre valeur et la valeur aléatoire
                        System.out.println("trop grand");
                    } else {
                        System.out.println("trop petit"); //si notre valeur est trop petite
                    }
                }
            }

            tentative++;
        }

        if (tentative == tentmax) { 
            System.out.println("Plus de tentatives disponible, c'était : " + nombreAleatoire); //si il n'y a plus assez de tentatives
        } else {
            System.out.println("Tentatives: " + (tentative + 1)); //nb tentatives
        }
    }
}