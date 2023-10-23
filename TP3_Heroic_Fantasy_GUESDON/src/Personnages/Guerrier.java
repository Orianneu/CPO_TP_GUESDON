/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author ogues
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval){
        super(nom, niveauDeVie);
        this.aCheval = aCheval; //a cheval ?
        nombreGuerriers++;} //+1 guerrier à nbguerriers
    
    public void attaquer(Personnage cible){ //méthode pour l'attaque
        int degats = armeEnMain.getNiveauAttaque(); //calcul dégats
        if (armeEnMain instanceof Epee){ //Si arme equipée est une épée
            degats *= ((Epee) armeEnMain).getFinesse();}
        if (aCheval){ //si à cheval, 1/2 de dégats en moins
            degats /= 2;} //divise par 2 les dégats

        cible.estAttaque(degats); //si attaqué
        seFatiguer(); //fatugue (-10pv)
    }
}
