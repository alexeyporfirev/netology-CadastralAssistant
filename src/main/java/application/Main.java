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
        System.out.println("Введите число генерируемых сделок: ");
        int numberOfDeals = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите цену за квадратный метр: ");
        int pricePerMeter = Integer.parseInt(scanner.nextLine());

        List<Deal> deals = DealGenerator.generateDeals(numberOfDeals);

        Function<List<Deal>, List<Deal>> function = data -> data.stream()
                .filter(el -> el.getCost() < el.getHeight() * el.getWidth() * pricePerMeter)
                .collect(Collectors.toList());
        List<Deal> correctedDeals = function.apply(deals);
        for(Deal deal : correctedDeals) {
            System.out.printf("Width: %d, height: %d, cost: %d\n", deal.getWidth(), deal.getHeight(), deal.getCost());
        }
    }
}
