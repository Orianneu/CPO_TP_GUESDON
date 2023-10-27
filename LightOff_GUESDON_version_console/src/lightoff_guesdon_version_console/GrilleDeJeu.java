/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_guesdon_version_console;

import java.util.Random;

/**
 *
 * @author ogues
 */
public class GrilleDeJeu {

    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * initialise la grille de jeu
     *
     * @param nbLignes nombre de lignes dans la matrice de jeu
     * @param nbColonnes nombre de colonnes dans la matrice de jeu
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        genererNouvelleMatriceCellulesLumineuses();
    }

    int i = 0;
    int j = 0;

    /**
     * parcours lignes et colonnes pour generer la grille de cellules eteintes
     */
    public void genererNouvelleMatriceCellulesLumineuses() {
        for (i = 0; i < nbLignes; i++) {
            for (j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * parcours lignes et colonnes pour eteindre chaque cellule
     */
    public void eteindreToutesLesCellules() {
        for (i = 0; i < nbLignes; i++) {
            for (j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * active une ligne, une colonne ou une diagonale aléatoirement
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int rand = random.nextInt(3);               //int au hasard entre 0,1 et 2
        if (rand == 1) {
            int colonneAleatoire = random.nextInt(nbColonnes);      //prends une colonne au hasard, de 0 à nb colonne (donc premiere colonne = 1, derniere = nbcolonne-1)
            activerColonneDeCellules(colonneAleatoire);         //active la colonne
        } else if (rand == 2) {
            int ligneAleatoire = random.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);
        } else {
            int rand2 = random.nextInt(2);
            if (rand2 == 0) {
                activerDiagonaleDescendante();
            } else {
                activerDiagonaleDescendante();
            }
        }
    }

    /**
     * génère un plateau de cellules lumineurses de manière aléatoire
     *
     * @param nombre spécifié de tours pour mélanger
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();
        for (int tour=0;tour<nbTours;tour++){
            int choix=random.nextInt(4); // nb aléatoire entre 0 et 3

            if (choix==0) {
                int ligne = random.nextInt(nbLignes); // Choix aléatoire d'une ligne
                for (int j=0;j<nbColonnes;j++){
                    if (j<nbLignes){
                        matriceCellules[j][j].activerCellule();}}}
            else if (choix == 2){
                for (int i=0; i<nbLignes;i++){
                    if (i<nbColonnes){
                        matriceCellules[i][i].activerCellule();}}}
            else if (choix == 1){
                int colonne = random.nextInt(nbColonnes); // Choix aléatoire d'une colonne
                for (int i=0; i<nbLignes;i++){
                    if (i<nbColonnes){
                        matriceCellules[i][colonne].activerCellule();}}}

            else if (choix == 3) {
                for (int i=0;i<nbLignes; i++){
                    if (i<nbColonnes){
                        matriceCellules[i][nbColonnes-i-1].activerCellule();}}}
        }
    }

    /**
     * prends cellule par cellule de la ligne et les actives
     *
     * @param idLigne
     */
    public void activerLigneDeCellules(int idLigne){
        for (j=0;j<nbColonnes;j++){
            matriceCellules[idLigne][j].activerCellule();}
    }

    /**
     * change l'état de toutes les cellules de la colonne
     *
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (i=0;i<nbLignes; i++){
            matriceCellules[i][idColonne].activerCellule();}
    }

    int a;

    /**
     * active la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante(){
        if (nbLignes>nbColonnes){
            a=nbColonnes;}
        else{
            a=nbLignes;
        }
        for(i=0;i<a;i++){
            matriceCellules[i][i].activerCellule();
        }
    }

    /**
     * active la diagonale montante de la grille
     */
    public void activerDiagonaleMontante(){
        if(nbLignes>nbColonnes){
            a=nbColonnes;}
        else{
            a=nbLignes;
        }
        for(i=0;i<a; i++) {
            matriceCellules[i][nbColonnes-1-i].activerCellule();} //active diag descendante (d'où le "-1-i")
    }

    /**
     * vérifie si toutes les cellules de la grille sont éteintes
     *
     * @return booléen : true si toutes les cellules sont eteinte, false sinon
     */
    public boolean cellulesToutesEteintes() {
        for(i=0; i<nbLignes; i++){ //parcours lignes
            for(j=0;j<nbColonnes;j++) { //parcours colonnes
                if (!matriceCellules[i][j].estEteint()) {
                    return false;}}}
        return true;
    }

    /**
     * affiche l'état de la grille sous forme d'une représentation visuelle
     * organisée
     *
     * @return grille en str
     */
    @Override
    public String toString(){
        String grilleStr = " |";
        for (int i=0;i<nbColonnes;i++){
            grilleStr += " " + i + " |";}      
        grilleStr += "\n";
        for (int i=0;i<(nbColonnes+1)*4;i++){
            grilleStr += "-";}
        grilleStr+="\n";
        for (int i=0;i<nbLignes;i++){
            grilleStr += i+" |";
            for (int j=0;j<nbColonnes;j++){
                if(matriceCellules[i][j].getEtat()){
                    grilleStr += " X |";}
                else{
                    grilleStr += " O |";}}
            grilleStr += "\n";
            for (int j=0;j<(nbColonnes+1)*4;j++){
                grilleStr += "-";}
            grilleStr += "\n";}
        return grilleStr;
    }
}