/*
 * TP3 Héritage, classe abstraite et interface
 * Orianne GUESDON
 * 18/10/2023
 */
package tp3_heroic_fantasy_guesdon;

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
        ArrayList<Arme> listeArmes = new ArrayList<>();

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);

        for (Arme arme:listeArmes) {
            System.out.println(arme);
        }
    }
}

