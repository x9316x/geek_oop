import java.util.List;

/**
 * Класс, реализующий интерфейс VendingMachine и представляющий торговый автомат с горячими напитками.
 */
public class HotDrinkMachine implements VendingMachine {
    /**
     * Список продуктов, доступных в автомате.
     */
    private final List<Product> products;

    /**
     * Создает новый экземпляр класса HotDrinkMachine.
     *
     * @param products список продуктов для инициализации автомата
     */
    public HotDrinkMachine(List<Product> products) {
        this.products = products;
    }

    /**
     * Получает продукт по его имени.
     *
     * @param name имя продукта
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    @Override
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    /**
     * Получает продукт по его имени, объему и температуре.
     *
     * @param name имя продукта
     * @param temperature температура напитка
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    public HotDrink getProduct(String name, int temperature){
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemperature() == temperature){
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
