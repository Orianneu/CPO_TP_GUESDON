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

public class GrilleDeJeu{
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * initialise la grille de jeu
     * @param nbLignes nombre de lignes dans la matrice de jeu
     * @param nbColonnes nombre de colonnes dans la matrice de jeu
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        genererNouvelleMatriceCellulesLumineuses();}
    
    int i=0;
    int j=0;

    /**
     * parcours lignes et colonnes pour generer la grille de cellules eteintes 
     */
    public void genererNouvelleMatriceCellulesLumineuses(){
        for (i=0; i< nbLignes;i++) { 
            for (j=0; j<nbColonnes;j++) {
                matriceCellules[i][j] = new CelluleLumineuse(false); 
            }
        }
    }

    /**
     * parcours lignes et colonnes pour eteindre chaque cellule
     */
    public void eteindreToutesLesCellules(){
        for (i=0;i<nbLignes;i++){
            for (j=0;j<nbColonnes;j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /**
     * active une ligne, une colonne ou une diagonale aléatoirement
     */
    public void activerLigneColonneOuDiagonaleAleatoire(){
        Random random = new Random();
        int rand = random.nextInt(3);               //int au hasard entre 0,1 et 2
        if (rand == 1){
            int colonneAleatoire = random.nextInt(nbColonnes);      //prends une colonne au hasard, de 0 à nb colonne (donc premiere colonne = 1, derniere = nbcolonne-1)
            activerColonneDeCellules(colonneAleatoire);         //active la colonne
        } else if(rand==2){
            int ligneAleatoire = random.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);}
        else{
            int rand2 = random.nextInt(2);
            if (rand2==0){
                activerDiagonaleDescendante();}
            else{
                activerDiagonaleDescendante();}
        }
    }

    /**
     * génère un plateau de cellules lumineurses de manière aléatoire
     * @param nbTours nombre spécifié de tours.
     */
    public void melangerMatriceAleatoirement(int nbTours){
            /// A FAIIIIIIIIIIIIIRE11111111111111
    }

    /**
     * prends cellule par cellule de la ligne et les actives
     * @param idLigne 
     */
    public void activerLigneDeCellules(int idLigne){
        for (j=0;j<nbColonnes;j++){
            matriceCellules[idLigne][j].activerCellule();
        }}
    
    /**
     * change l'état de toutes les cellules de la colonne
     * @param idColonne
     */
    public void activerColonneDeCellules(int idColonne){
        for (i =0; i< nbLignes;i++){ 
            matriceCellules[i][idColonne].activerCellule();
        }}
    
    int a;

    /**
     * active la diagonale descendante de la grille
     */
    public void activerDiagonaleDescendante(){
        if (nbLignes>nbColonnes){
            a = nbColonnes;}
        else{
            a = nbLignes;}
        for (i=0;i<a;i++) {
            matriceCellules[i][i].activerCellule();}}
        
    /**
     * active la diagonale montante de la grille
     */
    public void activerDiagonaleMontante(){
        if(nbLignes>nbColonnes){
            a = nbColonnes;}
        else{
            a = nbLignes;}
        for(i=0;i<a;i++){
            matriceCellules[i][nbColonnes-1-i].activerCellule();} //active diag descendante (d'où le "-1-i")
        }

    /**
     * vérifie si toutes les cellules de la grille sont éteintes
     * @return booléen : true si toutes les cellules sont eteinte, false sinon
     */
    public boolean cellulesToutesEteintes(){
        for (i=0;i<nbLignes;i++){ //parcours lignes
            for (j=0;j<nbColonnes;j++){ //parcours colonnes
                if (matriceCellules[i][j].getEtat(false)) { //verifie cellule à cellule si c'est eteint
                    return true;} //toutes les cellules sont eteintes
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();
        gridString.append(" |");
        for (int i=0; i<nbColonnes;i++){
            gridString.append(" " + i + " |");
        }
        gridString.append("\n");
        gridString.append("-".repeat((nbColonnes + 1) * 4)).append("\n");
        for (int i = 0; i < nbLignes; i++) {
            gridString.append(i).append(" |");
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getEtat(false)) {
                    gridString.append(" X |");
                } else {
                    gridString.append(" O |");
                }
            }
            gridString.append("\n");
            gridString.append("-".repeat((nbColonnes + 1) * 4)).append("\n");
        }

        return gridString.toString();
    }
}