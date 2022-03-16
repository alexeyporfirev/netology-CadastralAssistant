package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DealGenerator {

    private static Random random = new Random(System.currentTimeMillis());
    private final static int MAX_HEIGHT = 100;
    private final static int MAX_WIDTH = 100;
    private final static int MAX_COST = 1_000_000;

    public static List<Deal> generateDeals(int numberOfDeals) {
        List<Deal> deals = new ArrayList<>();
        for (int i = 0; i < numberOfDeals; i++) {
            deals.add(generateNewDeal());
        }
        return deals;
    }

    private static Deal generateNewDeal() {
        return new Deal(random.nextInt(MAX_HEIGHT), random.nextInt(MAX_WIDTH),random.nextInt(MAX_COST));
    }
}
