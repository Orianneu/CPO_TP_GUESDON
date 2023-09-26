/*
 * TP0 Exercice 2
 * Orianne GUESDON
 * 18 Septembre 2023
 */
package tp1_convertisseur_guesdon;

import java.util.Scanner;

/**
 *
 * @author ogues
 */
public class TP1_convertisseur_GUESDON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner saisieUtilisateur1 = new Scanner(System.in);  //saisie de la température
        System.out.println("Entrez une valeur : ");
        double temp = saisieUtilisateur1.nextDouble();
        
        Scanner saisieUtilisateur2 = new Scanner(System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n"  //Affichage du menu de choix de conversion
                + "1) De Celcius vers Kelvin\n" 
                + "2) De Kelvin vers Celcius\n"
                + "3) De Farenheit vers Celcius\n"
                + "4) De Kelvin vers Farenheit\n"
                + "5) De Farenheit vers Kelvin");
        int choix = saisieUtilisateur2.nextInt();
        
        if (choix == 1){        //vérification des conditions par rapport à la saisie, pour associer à la bonne "fonction"
            System.out.println("La température en Kelvin est : "+CelciusVersKelvin(temp)); //Affichage du résultat de la conversion
        }
        if (choix == 2){
            System.out.println("La température en Celcius est : "+KelvinVersCelcius(temp));
        }
        if (choix == 3){
            System.out.println("La température en Celcius est : "+FarenheitVersCelcius(temp));
        }
        if (choix == 4){
            System.out.println("La température en Farenheit est : "+KelvinVersFarenheit(temp));
        }
        if (choix == 5){
            System.out.println("La température en Kelvin est : "+FarenheitVersKelvin(temp));
        }  
    }
    public static double CelciusVersKelvin (double tempc) {  //Fonction de conversion 
        double tempk = tempc+273.15;        //Calcul de conversion de celcius en kelvin à l'aide de la formule générale
        return tempk;
    }
    public static double KelvinVersCelcius (double tempk) {
        double tempc = tempk-273.15;
        return tempc;
    }
    public static double FarenheitVersCelcius (double tempf) {
        double tempc = (tempf-32)/1.8;
        return tempc;
    }
    public static double KelvinVersFarenheit (double tempk) {
        double tempc = tempk-273.15;        //on passe par les Celcius pour revenir aux farenheit
        double tempf = (tempc*1.8)+32;
        return tempf;
    }
    public static double FarenheitVersKelvin (double tempf) {
        double tempc = (tempf-32)/1.8;
        double tempk = tempc+273.15;
        return tempk;
    }
}

