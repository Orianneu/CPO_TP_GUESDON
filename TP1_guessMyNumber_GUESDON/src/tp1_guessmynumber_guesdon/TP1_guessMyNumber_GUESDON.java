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

        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        System.out.println("Choisir la difficulté (1,2, 3 ou 4) : ");
        String niveau = scanner.nextLine();
        
        int tentmax = 15;
        boolean cauchemar = false;
        if (niveau == "4"){
            cauchemar = true;
        }
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
            System.out.println("Choisir un nombre entre 0 et 100 : ");
            int nombreUtilisateur = scanner.nextInt();

            if (nombreUtilisateur == nombreAleatoire) {
                System.out.println("Bravo!");
                break;
            } else {
                if (cauchemar && generateurAleat.nextInt(100) < 30) {
                    if (nombreUtilisateur < nombreAleatoire) {
                        System.out.println("trop grand");
                    } else {
                        System.out.println("trop petit");
                    }
                    
                } else {
                    if (nombreUtilisateur > nombreAleatoire) {
                        System.out.println("trop grand");
                    } else {
                        System.out.println("trop petit");
                    }
                }
            }

            tentative++;
        }

        if (tentative == tentmax) {
            System.out.println("Plus de tentatives disponible, c'était : " + nombreAleatoire);
        } else {
            System.out.println("Tentatives: " + (tentative + 1));
        }
    }
}