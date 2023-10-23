/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author ogues
 */

public class Baton extends Arme {
    private int age; //age du baton

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
