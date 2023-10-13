/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_guesdon;

/**
 *
 * @author ogues
 */
public class Voiture {
    String modele;
    String marque;
    int places;
    Personne proprietaire;

    public Voiture(String modele, String marque, int places) {
        this.modele = modele;
        this.marque = marque;
        this.places = places;
        this.proprietaire = null;
    }

    @Override
    public String toString() {
        return modele + " " + marque + " (" + places + " places)";
    }
}