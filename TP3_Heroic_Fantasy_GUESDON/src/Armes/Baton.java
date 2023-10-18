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
    int age;

    public Baton(String nom, int niveauattaque, int age) {
        super(nom, niveauattaque);
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Age : " + age;
    }
}
