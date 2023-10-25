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


    /**
     * Constructeur qui cree une nouvelle instance de la grille de cellules, et initialise le compteur de Coups à 0
     */
    public Partie() {
        this.grille = new GrilleDeJeu(7,7);
        this.nbCoups = 0;
    }

    /**
     * initialise la partie, s'assure que la grille est bien mélangée
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(8); 
    }

    /**
     * affiche état initial, et fais une boucle de jeu continue jusqu'a que la grille soit entièrement éteinte
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println(grille.toString());

            System.out.println(":");
            int ligne = scanner.nextInt();
            int colonne = scanner.nextInt();

            grille.activerLigneColonneOuDiagonaleAleatoire();

            nbCoups++;
            System.out.println("Nb coups : " + nbCoups);
        }

        System.out.println("Fini ! Toutes les cellules sont éteintes, bravo !");
        System.out.println("Nombre de coups total =" + nbCoups);
}}
