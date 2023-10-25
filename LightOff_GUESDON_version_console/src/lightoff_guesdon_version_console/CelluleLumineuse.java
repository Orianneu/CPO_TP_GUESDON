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

    public CelluleLumineuse(boolean par) {
        this.etat = false;}
    
    /**
     * change l'état de la cellule, si eteinte, allume et si allumée, eteint.
     */
    public void activerCellule() {
        this.etat = !this.etat;} 
    
    /**
     *  eteint la cellule peu importe son état
     */
    public void eteindreCellule() {
        this.etat = false;} 
    
    /**
     * vérifie si eteint. true si oui, false si elle est allumée
     * @return
     */
    public boolean estEteint() {
        return !this.etat;} 
    
    /**
     * renvoie etat actuel : true si allumée, false si eteint.
     * @return
     */
    public boolean getEtat(boolean bool) {
        return this.etat;} 
    
    /**
     * pour afficher O ou X si eteinte ou allumée
     * @return
     */
    @Override
    public String toString(){ 
        if (this.etat==true){
            return "X";
        }
        else if(this.etat==false){
            return "O";
        }
        return null;
    }
}
