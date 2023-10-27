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
     * Constructeur qui cree une nouvelle instance de la grille de cellules, et
     * initialise le compteur de Coups à 0
     */
    public Partie(){
        this.grille = new GrilleDeJeu(7, 7);
        this.nbCoups=0;
    }

    /**
     * initialise la partie, s'assure que la grille est bien mélangée
     */
    public void initialiserPartie(){
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);
    }

    /**
     * affiche état initial, et fais une boucle de jeu continue jusqu'a que la
     * grille soit entièrement éteinte
     */
    public void lancerPartie(){
    Scanner scanner = new Scanner(System.in);

    while (!grille.cellulesToutesEteintes()) {
        System.out.println(grille.toString()); // Afficher l'état de la grille

        System.out.println("Choisissez une option :");
        System.out.println("1. Éteindre une ligne");
        System.out.println("2. Éteindre une colonne");
        System.out.println("3. Éteindre une diagonale descendante");
        System.out.println("4. Éteindre une diagonale montante");
        System.out.println("0. Quitter");

        int choix = scanner.nextInt();

        if (choix == 1) {
            System.out.println("Entrez le numéro de la ligne (0-6) : ");
            int ligne = scanner.nextInt();
            grille.activerLigneDeCellules(ligne);}
        else if (choix == 2){
            System.out.println("Entrez le numéro de la colonne (0-6) : ");
            int colonne = scanner.nextInt();
            grille.activerColonneDeCellules(colonne);}
        else if (choix == 3){
            grille.activerDiagonaleDescendante();}
        else if (choix == 4){
            grille.activerDiagonaleMontante();}
        else if (choix == 0){
            System.out.println("Partie abandonnée.");
            break;}
        else{
            System.out.println("Choix invalide. Veuillez entrer un nombre entre 0 et 4.");}        
        nbCoups++; //+1 à nbCoups
    }

    System.out.println(grille.toString());
    System.out.println("Super ! Vous avez gagne en " + nbCoups + " coups.");
    scanner.close();
}

}
