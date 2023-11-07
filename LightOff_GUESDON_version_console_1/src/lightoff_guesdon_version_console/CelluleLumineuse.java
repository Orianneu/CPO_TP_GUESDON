/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_guesdon_version_console;

/**
 *
 * @author ogues
 */
public class CelluleLumineuse {

    private boolean etat; //etat : true si allumée et false si eteint

    /**
     * etat = eteint
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * change l'état de la cellule, si eteinte, allume et si allumée, eteint.
     */
    public void activerCellule() {
        this.etat = !this.etat;
    }

    /**
     * eteint la cellule peu importe son état
     */
    public void eteindreCellule() {
        this.etat = false;
    }

    /**
     * vérifie si eteint. true si oui, false si elle est allumée
     *
     * @return boolean , true si cellule eteinte, false sinon
     */
    public boolean estEteint() {
        if (etat == false) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * renvoie etat actuel : true si allumée, false si eteint.
     *
     * @return la variable etat
     */
    public boolean getEtat() {
        return this.etat;
    }

    /**
     * pour afficher O ou X si eteinte ou allumée
     *
     * @return string "X" ou "O" pour si cellule allumée ou éteinte
     */
    @Override
    public String toString() {
        if (this.etat == true) {
            return "X"; //"\u001B[43m  \u001B[0m";
        } else if (this.etat == false) {
            return "O"; //\u001B[47m  \u001B[0m";
        }
        return null;
    }
}
