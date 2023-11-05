/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_guesdon_version_console;

import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class LightOff_GUESDON_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int niveauchoix = 0;
        while (niveauchoix < 1 || niveauchoix > 3) { //tant que le niveau choisi n'est pas valide, redemande
            System.out.println("Choisissez le niveau de difficulté :");
            System.out.println("1.Facile (5x5)");
            System.out.println("2.Moyen (10x10)");
            System.out.println("3.Difficile (15x15)");
            niveauchoix = scanner.nextInt();
            if (niveauchoix < 1 || niveauchoix > 3) {
                System.out.println("Choix de niveau invalide. Veuillez réessayer.");
            }
        }
        Partie partie = new Partie(niveauchoix);
        partie.lancerPartie();
    }
}
