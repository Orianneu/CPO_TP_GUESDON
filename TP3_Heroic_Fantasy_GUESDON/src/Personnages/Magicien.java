/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Baton;

/**
 *
 * @author ogues
 */

public class Magicien extends Personnage {
    private boolean oui;

    public Magicien(String nom, int niveauDeVie, boolean oui) {
        super(nom, niveauDeVie);
        this.oui = oui;
        nombreMagiciens++;
    }

    public void attaquer(Personnage cible) {
        int degats = armeEnMain.getNiveauAttaque(); //points de dégats
        if (armeEnMain instanceof Baton) { //si armeEnMain est une instance de Baton
            degats *= ((Baton) armeEnMain).getAge();}
        if (oui){
            degats /= 2;}
       
        cible.estAttaque(degats); //si attaqué
        seFatiguer(); //fatigue après attaque
    }
}