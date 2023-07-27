/**
 * Класс, представляющий горячий напиток. Расширяет абстрактный класс Product, добавляя свойство температура.
 */
public class HotDrink extends Product {
    /**
     * Температура напитка.
     */
    private int temperature;

    /**
     * Создает новый экземпляр класса HotDrink.
     *
     * @param name имя продукта
     * @param cost стоимость продукта
     * @param temperature температура напитка
     */
    public HotDrink(String name, double cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    /**
     * Получает температуру напитка.
     *
     * @return температура напитка
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * Устанавливает температуру напитка.
     *
     * @param temperature температура напитка
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
