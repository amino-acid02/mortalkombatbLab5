package Enemies;

import EnemiesFabric.Player;

/**
 * Класс вражеского персонажа SubZero
 * @author Мария
 */
public class SubZero extends Player{
    
    /**
     * Конструктор
     */
    public SubZero(int level, int health, int damage , int attack){
        super (level, health, damage, attack);
    }
    /**
     * get метод 
     */
    @Override
    public String getName(){
        return "Sub-Zero";
    }
}
