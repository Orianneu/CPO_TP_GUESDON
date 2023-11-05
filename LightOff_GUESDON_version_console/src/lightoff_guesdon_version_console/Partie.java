/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_guesdon_version_console;

import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;
    private int niveau;

    /**
     * Constructeur qui cree une nouvelle instance de la grille de cellules, et
     * initialise le compteur de Coups à 0
     *
     * @param niveau c'est le niveau de la difficulté, 1 si facile, 2 si normal,
     * 3 si difficile
     */
    public Partie(int niveau) {
        this.niveau = niveau;
        this.nbCoups = 0;
        initialiserPartie();
    }

    /**
     * initialise la partie, génère grille de taille choisie (difficulte)
     * s'assure que la grille est bien mélangée
     */
    public void initialiserPartie() {
        int tailleGrille = 10;
        if (niveau == 1) {
            tailleGrille = 5;
        } else if (niveau == 2) {
            tailleGrille = 10;
        } else if (niveau == 3) {
            tailleGrille = 15;
        }
        grille = new GrilleDeJeu(tailleGrille, tailleGrille);
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(100);
    }

    /**
     * affiche état initial, et fais une boucle de jeu continue jusqu'a que la
     * grille soit entièrement éteinte
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        while (!grille.cellulesToutesEteintes()) {
            System.out.println(grille.toString());

            System.out.println("Choisissez une option :");
            System.out.println("1. Eteindre une ligne");
            System.out.println("2. Eteindre une colonne");
            System.out.println("3. Eteindre une diagonale descendante");
            System.out.println("4. Eteindre une diagonale montante");
            System.out.println("5. Mélanger");
            System.out.println("0. Quitter");

            int choix = scanner.nextInt();
            if (choix == 1) {
                System.out.println("Entrez le numéro de la ligne (0-" + (grille.getNbLignes() - 1) + ") : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne);
            } else if (choix == 2) {
                System.out.println("Entrez le numéro de la colonne (0-" + (grille.getNbColonnes() - 1) + ") : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne);
            } else if (choix == 3) {
                grille.activerDiagonaleDescendante();
            } else if (choix == 4) {
                grille.activerDiagonaleMontante();
            } else if (choix == 5) {
                grille.melangerMatriceAleatoirement(100);
            } else if (choix == 0) {
                System.out.println("Partie abandonnée.");
                break;
            } else {
                System.out.println("Choix invalide. Entrez un nombre entre 0 et 4.");
            }
            nbCoups++;
        }
        if (grille.cellulesToutesEteintes()) {
            System.out.println(grille.toString());
            System.out.println("Super ! Vous avez gagné en " + nbCoups + " coups.");
        }
        scanner.close();
    }
}
