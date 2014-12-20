/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.shamukov.factory;


import by.bsuir.shamukov.model.Soldier;
import by.bsuir.shamukov.model.Monster;
import by.bsuir.shamukov.model.Zombie;

public abstract class AbstractFactory {
    public abstract Monster createMonster();
    public abstract Zombie createZombie();
    public abstract Soldier createSoldier();
}
