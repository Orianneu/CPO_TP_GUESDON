/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_guesdon;

/**
 *
 * @author ogues
 */

public class BouteilleBiere {
    //Initialisation des variables
    String Nom; //nom de la biere
    double degreAlcool; //son degre d'alcool
    String brasserie; //nom de la brasserie
    boolean ouverte; //ouverte ou fermée
    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; //la bouteille est initialement fermée
    }
    
    public void lireEtiquette() { //Affichage de l'étiquette 
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
    }
    
    public boolean Décapsuler() { //méthode qui vérifie si la bière est ouverte ou non et l'ouvre si pas ouverte
        if (!ouverte) { //vérification de l'état
            ouverte = true; //elle est fermée
            return true; 
        } else {
            System.out.println("La bière est déjà ouverte"); //la biere est ouverte donc affiche qu'elle est déjà ouverte
            return false;
        }
    }
    @Override
    public String toString() { //affichage de la chaine
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
        if (ouverte == true ) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}

