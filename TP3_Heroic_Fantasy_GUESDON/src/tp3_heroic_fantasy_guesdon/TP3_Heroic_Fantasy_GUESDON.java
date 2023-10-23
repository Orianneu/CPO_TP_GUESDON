/*
 * TP3 Héritage, classe abstraite et interface
 * Orianne GUESDON
 * 18/10/2023
 */
package tp3_heroic_fantasy_guesdon;

import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;

/**
 *
 * @author ogues
 */
public class TP3_Heroic_Fantasy_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5); //création excalibur
        Epee durandal = new Epee("Durandal", 4, 7); //création Durandal
        Baton chene = new Baton("Chene", 4, 5); //création Chêne
        Baton charme = new Baton("Charme", 5, 6); //création Charme

        ArrayList<Arme> armes = new ArrayList<>(); //tableau dynamique armes
        armes.add(excalibur); //ajout excalibur au tableau
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        for (Arme arme : armes) {
            System.out.println(arme); //affichage des armes
        }
        
        //Lannister le guerrier
        Guerrier lannister = new Guerrier("Lannister", 45, true);
        //Conan le guerrier
        Guerrier conan = new Guerrier("Conan", 78, false);
        //Gandalf le magicien
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        //Garcimore le guerrier
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        ArrayList<Personnage> personnages = new ArrayList<>(); //tableau dynamique armes
        personnages.add(gandalf); //ajout de gandalf au tableau
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        for (Personnage personnage : personnages) {
            System.out.println(personnage); //affichage personnages
        }
        //// GUERRIERS ////
        conan.ajouterArme(excalibur); //on donne des armes à conan
        conan.ajouterArme(durandal);
        lannister.ajouterArme(excalibur);//on donne des armes à lannister
        lannister.ajouterArme(durandal);
        conan.equiperArme("Excalibur"); //conan prends excalibur
        lannister.equiperArme("Durandal"); //lannister prends durandal
        
        //// MAGICIENS ////
        gandalf.ajouterArme(chene); //on donne des batons à gandalf
        gandalf.ajouterArme(charme);
        garcimore.ajouterArme(chene);//on donne des batons à garcimore
        garcimore.ajouterArme(charme);
        gandalf.equiperArme("Chene"); //gandalf prend chene
        garcimore.equiperArme("Charme");//garcimore prend chene

        System.out.println("Nb total personnage:"+Personnage.getNombrePersonnages());
        System.out.println("Nb guerriers"+Guerrier.getNombreGuerriers());
        System.out.println("Nb magiciens:"+Magicien.getNombreMagiciens());

        //// COMBAT ENTRE GANDALF ET CONAN ////
        System.out.println("\nAvant combat :");
        System.out.println(conan); //affiche stats de conan avant le combat
        System.out.println(gandalf);

        conan.attaquer(gandalf);

        System.out.println("\nApres combat :");
        System.out.println(conan); //affiche stats de conan après le combat
        System.out.println(gandalf);

        System.out.println("\nLe guerrier est vivant : " + conan.estVivant()); //affiche si le personnage est encore en vie
        System.out.println("Le magicien est vivant : " + gandalf.estVivant());
    }
}