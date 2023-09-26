/*
 * TP1 Exo1
 * GUESDON Orianne
 * 26/09/2023
 */
package tp1_manipnombresint_guesdon;

import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class TP1_manipNombresint_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Saisir le premier entier : "); //affichage demande de l'entier
        Scanner saisieUtilisateur1 = new Scanner(System.in); //saisie de l'entier 1
        int entier1 = saisieUtilisateur1.nextInt();
        Scanner ent1 = saisieUtilisateur1;
        
        System.out.println("Saisir le premier entier : "); //affichage demande de l'entier
        Scanner saisieUtilisateur2 = new Scanner(System.in); //saisie de l'entier 2
        int entier2 = saisieUtilisateur2.nextInt();
        Scanner ent2 = saisieUtilisateur2;
        
        System.out.println("Les entiers sont " + entier1 + " et " + entier2); //Affichage des deux entiers saisis
          
        int somme = entier1 + entier2; //calcul de la somme stocké dans une variable "somme"
        int diff = entier1 - entier2;
        int produit = entier1 * entier2; 
        System.out.println("La somme est : " + somme + " La difference est : " + diff + " Le produit est : " + produit); //Affichage de la somme, du produit et de la différence des entiers saisis

        int quotient = entier1/entier2; //calcul quotient des entiers
        int reste = entier1%entier2;
        System.out.println("Le quotient est : " + quotient + " Le reste est : " + reste); //Affichage du quotient et du reste depuis les variables "quotient" et "reste"

      
    }
    
}
