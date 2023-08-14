package com.bnyte.designpatterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

public class CharacterFactoryTest {

    private static final MonsterFactory monsterFactory = new MonsterFactory();
    private static final PlayerFactory playerFactory = new PlayerFactory();

    @Test
    public void createCharacter() {
        Character superhuman = monsterFactory.createCharacter("超人强", 200);
        superhuman.attack(); // 超人强 正在攻击
        superhuman.defend(); // 超人强 正在防御

        Character ggboy = playerFactory.createCharacter("猪猪侠", 100);
        ggboy.attack(); // 猪猪侠 正在攻击
        ggboy.defend(); // 猪猪侠 正在防御
    }
}