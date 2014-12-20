/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.shamukov.factory;

import by.bsuir.shamukov.model.Monster;
import by.bsuir.shamukov.model.Soldier;
import by.bsuir.shamukov.model.Zombie;
import by.bsuir.shamukov.random.Random;


/**
 *
 * @author Шамуков
 */

public class FactoryHigh extends AbstractFactory{

    @Override
    public Monster createMonster() {
       int health = Random.getRandomNumber(70, 100);
       int damage = Random.getRandomNumber(50, 60);
       Monster monster = new Monster(Monster.name, health, damage);
       return monster;
    }

    @Override
    public Zombie createZombie() {
       int health = Random.getRandomNumber(70, 100);
       int damage = Random.getRandomNumber(50, 60);
       Zombie zombie = new Zombie(Zombie.name, health, damage);
       return zombie;
    }

    @Override
    public Soldier createSoldier() {
        int health = Random.getRandomNumber(70, 100);
        int damage = Random.getRandomNumber(50, 60);
        Soldier soldier = new Soldier(Soldier.name, health, damage);
        return soldier;
    }
}
