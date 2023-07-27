import java.util.List;

/**
 * Класс, реализующий интерфейс VendingMachine и представляющий торговый автомат с водой.
 */
public class WaterBottleVendingMachine implements VendingMachine {
    /**
     * Список продуктов, доступных в автомате.
     */
    private final List<Product> products;

    /**
     * Создает новый экземпляр класса WaterBottleVendingMachine.
     *
     * @param products список продуктов для инициализации автомата
     */
    public WaterBottleVendingMachine(List<Product> products) {
        this.products = products;
    }

    /**
     * Получает продукт по его имени.
     *
     * @param name имя продукта
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    /**
     * Получает продукт по его имени и объему.
     *
     * @param name имя продукта
     * @param volume объем воды
     * @return продукт
     * @throws IllegalStateException если продукт не найден
     */
    public BottleWater getProduct(String name, int volume){
        for(Product product: products){
            if(product instanceof BottleWater){
                if(product.getName().equalsIgnoreCase(name) && ((BottleWater) product).getVolume() == volume){
                    return (BottleWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
