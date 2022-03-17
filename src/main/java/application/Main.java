package application;

import tools.Deal;
import tools.DealGenerator;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of the generated deals: ");
        int numberOfDeals = Integer.parseInt(scanner.nextLine());
        System.out.println("Input cost per meter: ");
        int pricePerMeter = Integer.parseInt(scanner.nextLine());

        // генерируем набор сделок
        List<Deal> deals = DealGenerator.generateDeals(numberOfDeals);

        //создаем ф-цию через функциональный интерфейс, которая выбирает только честные сделки
        Function<List<Deal>, List<Deal>> cadastralAssistant = data -> data.stream()
                .filter(el -> el.getCost() < el.getHeight() * el.getWidth() * pricePerMeter)
                .collect(Collectors.toList());

        // Применяем нашу вспомогательную ф-цию для выбора
        List<Deal> correctedDeals = cadastralAssistant.apply(deals);

        // выводим на экран только честные сделки
        System.out.println("Fair deals:");
        for(Deal deal : correctedDeals) {
            System.out.printf("Width: %d, length: %d, cost: %d\n", deal.getWidth(), deal.getHeight(), deal.getCost());
        }
    }
}
