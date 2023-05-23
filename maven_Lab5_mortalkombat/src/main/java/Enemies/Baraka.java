package Enemies;

import EnemiesFabric.Player;

/**
 * Класс вражеского персонажа Baraka
 * @author Мария
 */
public class Baraka extends Player{
    
    /**
     * Конструктор
     */
    public Baraka(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    /**
     * get метод 
     * @return 
     */
    @Override
    public String getName(){
        return "Baraka";
    }
    
}
