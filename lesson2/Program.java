package lesson2;
public class Program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Petr");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
    
}
