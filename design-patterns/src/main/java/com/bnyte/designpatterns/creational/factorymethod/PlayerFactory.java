package com.bnyte.designpatterns.creational.factorymethod;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public class PlayerFactory implements CharacterFactory {
    @Override
    public Character createCharacter(String name, int health) {
        return new Player(name, health);
    }
}
