/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.shamukov.runner;

import by.bsuir.shamukov.model.Zombie;
import by.bsuir.shamukov.model.Soldier;
import by.bsuir.shamukov.model.Monster;
import by.bsuir.shamukov.factory.FactoryHigh;
import by.bsuir.shamukov.factory.FactoryMedium;
import by.bsuir.shamukov.factory.FactoryEasy;
import by.bsuir.shamukov.random.Random;


/**
 *
 * @author Шамуков
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FactoryEasy factoryEasy = new FactoryEasy();
        
        int countEasy = Random.getRandomNumber(2, 4);
        System.out.println("All characters in low level: " + countEasy);
        for(int i = 0; i < countEasy; i++){
            Monster monster1 = factoryEasy.createMonster();
            Zombie zombie1 = factoryEasy.createZombie();
            Soldier soldier1 = factoryEasy.createSoldier();
            System.out.println(monster1+"\n"+zombie1+"\n"+soldier1);
        }
        
        int countMedium = Random.getRandomNumber(3, 5);
        System.out.println("\nAll characters in medium level: " + countMedium);
        
        FactoryMedium factoryMedium = new FactoryMedium();
        for(int i = 0; i < countMedium; i++){
            Monster monster2 = factoryMedium.createMonster();
            Zombie zombie2 = factoryMedium.createZombie();
            Soldier soldier2 = factoryMedium.createSoldier();
            System.out.println(monster2+"\n"+zombie2+"\n"+soldier2);
        }
        
        int countHigh = Random.getRandomNumber(4, 6);
        System.out.println("\nAll characters in high level: " + countHigh);
        FactoryHigh factoryHigh = new FactoryHigh();
        
        for(int i = 0; i < countHigh; i++){    
            Monster monster3 = factoryHigh.createMonster();
            Zombie zombie3 = factoryHigh.createZombie();
            Soldier soldier3 = factoryHigh.createSoldier();
            System.out.println(monster3+"\n"+zombie3+"\n"+soldier3);
        }
        
    }
    
}
