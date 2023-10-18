/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ogues
 */

public abstract class Arme {
    String nom;
    int niveauattaque;
    
    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauattaque = niveauAttaque;
    }
    
    public int accesniveauattaque() {
        return niveauattaque;
    }

    public String accesnom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Niveau d'attaque : " + niveauattaque;
    }       
        
}
