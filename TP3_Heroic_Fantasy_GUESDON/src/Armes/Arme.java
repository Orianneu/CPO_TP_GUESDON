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
    protected String nom; //nom de l'arme
    protected int niveauAttaque; //niveau d'attaque de l'arme
    private String type; //type de l'arme

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        this.niveauAttaque = niveauAttaque;}
   
    public int getNiveauAttaque() {
        return niveauAttaque;}
        
    public String getType() {
        return type;}
    
    public String getNom() {
        return nom;}
    
    public String toString() {
        return "Nom arme : " + nom + ", Niveau : " + niveauAttaque;}
}

