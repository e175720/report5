package jp.ac.uryukyu.ie.e175720;

import org.junit.Test;
import static org.junit.Assert.*;
public class EnemyTest {

    @Test
    public void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);
        for(int i=0; i<10; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.getHitPoint());
    }

}