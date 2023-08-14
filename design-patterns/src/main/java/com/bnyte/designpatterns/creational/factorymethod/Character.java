package com.bnyte.designpatterns.creational.factorymethod;

/**
 * @author kaisa.liu
 * @since 1.0.0
 */
public abstract class Character {

    private String name;

    private Integer health;

    public Character(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    protected String getAttackOutput() {
        return "%s 正在攻击".formatted(name);
    }

    protected String getDefendOutput() {
        return "%s 正在防御".formatted(name);
    }

    public abstract void attack();

    public abstract void defend();

}
