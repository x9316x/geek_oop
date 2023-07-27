/**
 * Абстрактный класс, представляющий общую структуру продукта.
 */
public abstract class Product {
    /**
     * Имя продукта.
     */
    private String name;

    /**
     * Стоимость продукта.
     */
    private double cost;

    /**
     * Создает новый экземпляр класса Product.
     *
     * @param name имя продукта
     * @param cost стоимость продукта
     */
    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Получает имя продукта.
     *
     * @return имя продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя продукта.
     *
     * @param name имя продукта
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получает стоимость продукта.
     *
     * @return стоимость продукта
     */
    public double getCost() {
        return cost;
    }

    /**
     * Устанавливает стоимость продукта.
     *
     * @param cost стоимость продукта
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Возвращает строковое представление продукта.
     *
     * @return строковое представление продукта
     */
    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", cost=" + cost +
               '}';
    }
}
