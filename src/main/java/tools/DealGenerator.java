package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DealGenerator {


    private static Random random = new Random(System.currentTimeMillis());

    // Максимальное значение длины комнаты для генерации
    private final static int MAX_LENGTH = 100;
    // Максимальное значение ширины комнаты для генерации
    private final static int MAX_WIDTH = 100;
    // Максимальное значение стоимости комнаты для генерации
    private final static int MAX_COST = 1_000_000;

    /**
     * Генерация набора сделок
     * @param numberOfDeals Количество генерируемых сделок
     * @return Список со сгенерированными сделками
     */
    public static List<Deal> generateDeals(int numberOfDeals) {
        List<Deal> deals = new ArrayList<>();
        for (int i = 0; i < numberOfDeals; i++) {
            deals.add(generateNewDeal());
        }
        return deals;
    }

    /**
     * Генерация одной новой сделки
     * @return Объект сгенерированной сделки
     */
    private static Deal generateNewDeal() {
        return new Deal(random.nextInt(MAX_LENGTH), random.nextInt(MAX_WIDTH),random.nextInt(MAX_COST));
    }

}
