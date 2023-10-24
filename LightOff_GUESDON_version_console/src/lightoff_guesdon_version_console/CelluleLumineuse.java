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

    public CelluleLumineuse() {
        this.etat = false;}
    
    public void activerCellule() {
        this.etat = !this.etat;} //change l'état de la cellule, si eteinte, allume et si allumée, eteint.
    
    public void eteindreCellule() {
        this.etat = false;} //eteint la cellule peu importe son état
    
    public boolean estEteint() {
        return !this.etat;} //vérifie si eteint. true si oui, false si elle est allumée
    
    public boolean getEtat() {
        return this.etat;} //renvoie etat actuel : true si allumée, false si eteint.
    
    @Override
    public String toString() { //redefini to string
        return this.etat ? "X" : "O";} //pour afficher O ou X si eteinte ou allumée

    boolean getEtat(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


    
