/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ogues
 */

public class Epee extends Arme {
    int indicefinesse;

    public Epee(String nom, int niveauattaque, int indicefinesse) {
        super(nom, niveauattaque);
        this.indicefinesse = indicefinesse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Indice de finesse : " + indicefinesse;
    }
}