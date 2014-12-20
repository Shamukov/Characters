package by.bsuir.shamukov.model;
import by.bsuir.shamukov.model.Monster;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shamukov
 */

public class CharacterTest {
    /**
     * Проверяет получаемое значение здоровья
     */
    @Test
    public void testGetHealth() {
        System.out.println("getHealth"); // Задаем начальные значения
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(Monster.name, health, damage);// Получаем значение здоровья
        int result = instance.getHealth();// Проверяем значение. Если результат не равен healt, то значение здоровья изменилось
        assertTrue("Значение здоровья задано не верно", result == health);
    }

    /**
     * Проверяет задаваемое значение здоровья
     */
    @Test
    public void testSetHealth() {
        System.out.println("setHealth");// Задаем начальные значения
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(Monster.name, health, damage);// Получаем значение здоровья
        instance.setHealth(health);
        assertTrue("Значение здоровья изменилось", health == instance.getHealth());
    }

    /**
     * Проверяет получаемое значение урона
     */
    @Test
    public void testGetDamage() {
        System.out.println("getDamage");// Задаем начальные значения
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(Monster.name, health, damage);// Получаем значение урона
        int result = instance.getDamage();// Проверяем значение. Если результат не равен damage, то значение урона изменилось
        assertTrue("Значение урона задано не верно", result == damage);
    }

    /**
     * Проверяет задаваемое значение урона
     */
    @Test
    public void testSetDamage() {
        System.out.println("getDamage");
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(Monster.name, health, damage);
        instance.setDamage(damage);
        assertTrue("Значение урона изменилось", damage == instance.getDamage());
    }

    /**
     * Проверяет возвращаемое значение на null
     */
    @Test
    public void testGetNameNull() {
        System.out.println("testGetNameNull");
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(null, health, damage);
        String result = instance.getName();
        assertNull("Имя не null", result);
    }

    /**
     * Test of setName method, of class Character.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        int health = 100;
        int damage = 10;
        by.bsuir.shamukov.model.Character instance = new by.bsuir.shamukov.model.Character(Monster.name, health, damage);
        String name = "Monster";
        instance.setName(name);
        assertTrue("Значение имени изменилось", name == instance.getName());
    }
}
