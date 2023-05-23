package EnemiesFabric;

import Enemies.SonyaBlade;

/**
 * Класс для создания вражеского персонажа SonyaBlade
 * @author Мария
 */
public class SonyaBladeFabric implements EnemyFabricInterface {

    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}
