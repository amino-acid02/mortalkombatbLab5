package Enemies;

import EnemiesFabric.Player;

/**
 * Класс вражеского персонажа LiuKang
 * @author Мария
 */
public class LiuKang extends Player{
    
    /**
     * Конструктор
     */
    public LiuKang(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
    }
    /**
     * get метод 
     * @return 
     */
    @Override
    public String getName(){
        return "Liu Kang";
    }
}
