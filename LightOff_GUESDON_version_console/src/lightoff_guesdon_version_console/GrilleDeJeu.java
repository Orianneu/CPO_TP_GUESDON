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

    public GrilleDeJeu(int nbLignes, int nbColonnes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        genererNouvelleMatriceCellulesLumineuses();}
    
    int i=0;
    int j=0;
    public void genererNouvelleMatriceCellulesLumineuses(){
        for (i=0; i< nbLignes;i++) { //parcours les lignes
            for (j=0; j<nbColonnes;j++) { //parcours les colonnes
                matriceCellules[i][j] = new CelluleLumineuse(false); //pour generer la grille de cellules eteintes
            }
        }
    }

    public void eteindreToutesLesCellules(){
        for (i=0;i<nbLignes;i++) { //parcours les lignes
            for (j=0;j<nbColonnes;j++) { //parcours les colonnes
                matriceCellules[i][j].eteindreCellule(); //eteint chaque cellule
            }
        }
    }

    public void activerLigneOuCelluleAleatoire(){
        Random random = new Random();
        int rand = random.nextInt(2); //int au hasard entre 0 ET 1
        if (rand == 1){
            int colonneAleatoire = random.nextInt(nbColonnes); //prends une colonne au hasard, de 0 à nb colonne (donc premiere colonne = 1, derniere = nbcolonne-1)
            activerColonneDeCellules(colonneAleatoire); //active la colonne
        } else {
            int ligneAleatoire = random.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);}
    }

    public void genererMatriceAleatoire(int nbTours){
        eteindreToutesLesCellules();
        Random random = new Random();
        for (int k=0; k<nbTours; k++) {
            int rand1 = random.nextInt(3); //0=ligne 1=colonne 2=diag

                if (rand1==0){ //si ligne
                    int ligneAleatoire = random.nextInt(nbLignes); //prends une ligne au hasard
                    activerLigneDeCellules(ligneAleatoire); //active
                    break;}
                else if (rand1==1){ //si colonne
                    int colonneAleatoire = random.nextInt(nbColonnes); //prends une colonne au hasard
                    activerColonneDeCellules(colonneAleatoire); //active
                    break;}
                else if (rand1==2){ //si diagonale
                    int rand2 = random.nextInt(2); //0=diag montante 1=diag descendante 
                    if(rand2==0){ //diag descendante
                        activerDiagonaleDescendante(); //active diag descendante
                        break;} //stop
                    else if(rand2==1){
                        activerDiagonaleMontante();
                        break;} 
                }
        }
    }

    public void activerLigneDeCellules(int idLigne){
        for (j=0;j<nbColonnes;j++) { //prends cellule par cellule de la ligne
            matriceCellules[idLigne][j].activerCellule(); //active la cellule
        }}
    
    public void activerColonneDeCellules(int idColonne){
        for (i =0; i< nbLignes;i++){ //prends cellule par cellule de la colonne
            matriceCellules[i][idColonne].activerCellule(); //active
        }}
    
    int a;
    public void activerDiagonaleDescendante(){
        if (nbLignes>nbColonnes){
            a = nbColonnes;}
        else{
            a = nbLignes;}
        for (i=0;i<a;i++) {
            matriceCellules[i][i].activerCellule();}}
        
    public void activerDiagonaleMontante(){
        if(nbLignes>nbColonnes){
            a = nbColonnes;}
        else{
            a = nbLignes;}
        for(i=0;i<a;i++){
            matriceCellules[i][nbColonnes-1-i].activerCellule();} //active diag descendante (d'où le "-1-i")
        }

    public boolean cellulesToutesEteintes(){
        for (i=0;i<nbLignes;i++){ //parcours lignes
            for (j=0;j<nbColonnes;j++){ //parcours colonnes
                if (matriceCellules[i][j].getEtat(false)) { //verifie cellule à cellule si c'est eteint
                    return false;} //toutes les cellules sont eteintes
            }
        }
        return true;
    }}

////AJOUTER toString()
