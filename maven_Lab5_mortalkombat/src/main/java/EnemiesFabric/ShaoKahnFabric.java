package EnemiesFabric;

import Enemies.ShaoKahn;

/**
 * Класс для создания вражеского персонажа ShaoKahn
 * @author Мария
 */
public class ShaoKahnFabric implements EnemyFabricInterface{
    
    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create(int i) {
        Player enemy;
        if(i==0){
            enemy = new ShaoKahn(3, 100, 30, 1);
        }
        else{
           enemy = new ShaoKahn(3, 145, 44, 1); 
        }
        return enemy;
    }
}
