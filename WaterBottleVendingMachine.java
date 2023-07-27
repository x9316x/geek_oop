import java.util.*;

public class WaterBottleVendingMachine implements VendingMachine {
    private List<Product> products;

    public WaterBottleVendingMachine() {
        this.products = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}
