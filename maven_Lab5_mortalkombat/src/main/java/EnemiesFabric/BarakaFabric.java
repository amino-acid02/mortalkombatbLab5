package EnemiesFabric;

import Enemies.Baraka;

/**
 * Класс для создания вражеского персонажа Baraka
 * @author Мария
 */
public class BarakaFabric implements EnemyFabricInterface {

    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
