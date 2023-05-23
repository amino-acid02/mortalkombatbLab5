package Enemies;

import EnemiesFabric.Player;

/**
 * Класс вражеского персонажа SonyaBlade
 * @author Мария
 */
public class SonyaBlade extends Player{
    
    /**
     * Конструктор
     */
    public SonyaBlade (int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    /**
     * get метод 
     */
    @Override
    public String getName(){
        return "Sonya Blade";
    }
}
