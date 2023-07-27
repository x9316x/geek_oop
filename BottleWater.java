/**
 * Класс, представляющий бутылку воды. Расширяет абстрактный класс Product, добавляя свойство объема.
 */
public class BottleWater extends Product {
    /**
     * Объем воды в бутылке.
     */
    private int volume;

    /**
     * Создает новый экземпляр класса BottleWater.
     *
     * @param name имя продукта
     * @param cost стоимость продукта
     * @param volume объем воды в бутылке
     */
    public BottleWater(String name, double cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    /**
     * Получает объем воды в бутылке.
     *
     * @return объем воды
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Устанавливает объем воды в бутылке.
     *
     * @param volume объем воды
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * Возвращает строковое представление бутылки воды.
     *
     * @return строковое представление бутылки воды
     */
    @Override
    public String toString() {
        return "BottleOfWater{" +
               "name='" + super.getName() + '\'' +
               "volume='" + this.volume + '\'' +
               ", cost=" + super.getCost() +
               '}';
    }

    /**
     * Сравнивает этот объект бутылки воды с указанным объектом.
     *
     * @param o объект, с которым производится сравнение
     * @return true, если объекты равны; false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleWater)) {
            return false;
        }

        BottleWater that = (BottleWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getCost() == that.getCost()
               && getVolume() == that.getVolume();
    }
}
