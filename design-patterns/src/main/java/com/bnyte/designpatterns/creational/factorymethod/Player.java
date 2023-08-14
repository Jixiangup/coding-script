package com.bnyte.designpatterns.creational.factorymethod;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public class Player extends Character {

    public Player(String name, Integer health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println(getAttackOutput());
    }

    @Override
    public void defend() {
        System.out.println(getDefendOutput());
    }
}
