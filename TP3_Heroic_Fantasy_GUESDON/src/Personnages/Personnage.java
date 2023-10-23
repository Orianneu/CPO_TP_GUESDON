/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Arme;
import java.util.ArrayList;
import tp3_heroic_fantasy_guesdon.etreVivant;

/**
 *
 * @author ogues
 */

public abstract class Personnage implements etreVivant {
    protected String nom; //nom du personnage
    protected int niveauDeVie; //pv
    protected ArrayList<Arme> inventaire = new ArrayList<>(); //inventaire
    protected Arme armeEnMain=null; //l'arme en main
    protected static int nombrePersonnages=0; //nombre de personnage en tout
    protected static int nombreGuerriers=0; //nombre de guerriers
    protected static int nombreMagiciens=0; //nombre de magiciens

    public Personnage(String nom, int niveauDeVie){
        this.nom=nom;
        this.niveauDeVie=niveauDeVie;
        nombrePersonnages++;} //ajoute le perso au nb de personnages total
    
    public static int getNombrePersonnages(){
        return nombrePersonnages;}  
    public static int getNombreGuerriers(){
        return nombreGuerriers;}
    public static int getNombreMagiciens(){
        return nombreMagiciens;}
    public int getNiveauDeVie(){
        return niveauDeVie;}   
    public String getNom(){
        return nom;}
    
    public void ajouterArme(Arme arme){
        if (inventaire.size()<5) { //verifie si il y a moins de 5 armes dans inventaire càd si il y a de la place
            inventaire.add(arme); //il y en a donc ajoute la nouvelle arme
        } else { //pas de place
            System.out.println("Inventaire plein"); //préviens qu'il n'y a pas de place
        }}
    

    public void equiperArme(String nomArme){ //méthode pour équiper l'arme
        for (Arme arme : inventaire){ //parcours l'inventaire
            if (arme.getNom()==nomArme){ //si l'arme demandé est dans inventaire
                armeEnMain = arme; //prends arme -> arme en main
                System.out.println(nom + " equipe " + arme.getNom()); //dit que le personnage a équiper l'arme
                return;
            }
        }
        System.out.println(nom+" n'a pas " + nomArme);} //si l'arme demandée n'est pas sur le joueur
    
    public int nombreArmesDePredilection(String typeArme){
        int count = 0; //init
        for (Arme arme : inventaire) { //parcours inventaire
            if (arme.getType()==typeArme) { //si type de l'arme est bon
                count++; //ajoute +1
            }
        }
        return count;
    }

    public String toString(){
        String resultat="Nom:"+nom+", Niveau de vie:"+niveauDeVie; //affiche nom + niveau de vie
        if (armeEnMain!=null){ //si il y a une arme en main
            resultat +=" "+ armeEnMain; //affiche l'arme en main
        }
        return resultat;
    }

    public void seFatiguer(){ //methode pour fatigue
        if (niveauDeVie > 10){ //si il y a plus de 10pv
            niveauDeVie-=10; //perte de 10 pv pour l'action qui fatigue
        } else {
            niveauDeVie=0; //moins de 10pv, pv=0 (tue)
        }
    }

    public boolean estVivant(){
        return niveauDeVie>0;}  //vivant alors pv>0

    public void estAttaque(int points) { //méthode si attaqué
        if (niveauDeVie > points) { //si pv > pts
            niveauDeVie -= points; //alors le niveau de vie perds en pv le nombre de points
        } else {
            niveauDeVie = 0; //si il y a moins de pv que pts de l'attaque, pv=0 -> meurt
        }
    }
}

