package EnemiesFabric;

import Enemies.LiuKang;

/**
 * Класс для создания вражеского персонажа LiuKang
 * @author Мария
 */
public class LiuKangFabric implements EnemyFabricInterface {

    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}
