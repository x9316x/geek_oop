import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Основной метод для демонстрации работы торгового автомата с горячими напитками.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаем несколько горячих напитков
        HotDrink coffee = new HotDrink("Coffee", 100.0, 80);
        HotDrink tea = new HotDrink("Tea", 50.0, 90);

        // Добавляем их в список продуктов
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(coffee);
        hotDrinks.add(tea);

        // Создаем торговый автомат с горячими напитками
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine(hotDrinks);

        // Получаем напиток по имени
        Product requestedDrink = hotDrinkMachine.getProduct("Coffee");
        System.out.println(requestedDrink.getName());

        // Получаем напиток по имени и температуре
        HotDrink requestedHotDrink = hotDrinkMachine.getProduct("Coffee", 80);
        System.out.println(requestedHotDrink.getName());
    }
}
