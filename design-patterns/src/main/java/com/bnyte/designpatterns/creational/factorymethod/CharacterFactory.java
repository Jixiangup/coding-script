package com.bnyte.designpatterns.creational.factorymethod;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public interface CharacterFactory {

    Character createCharacter(String name, int health);

}
