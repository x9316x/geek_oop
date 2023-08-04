package lesson2;
import java.util.List;

public interface MarketBeheviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
