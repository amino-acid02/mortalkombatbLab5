package EnemiesFabric;

import Enemies.SubZero;

/**
 * Класс для создания вражеского персонажа SubZero
 * @author Мария
 */
public class SubZeroFabric implements EnemyFabricInterface {

    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }

}
