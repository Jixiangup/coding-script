package com.bnyte.designpatterns.creational.factorymethod;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public class MonsterFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int health) {
        return new Monster(name, health);
    }
}
