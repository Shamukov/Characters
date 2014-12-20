/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.shamukov.model;

/**
 *
 * @author Шамуков
 */
public class Soldier extends Character{

    public static String name = "Soldier";
    
    public Soldier(String name, int health, int damage) {
        super(name, health, damage);
    }    
}
