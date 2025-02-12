package dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T> {
    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public List<Product<T>> getProducts() {
        return products;
    }


    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
        System.out.println("Discount applied: " + percentage + "% to " + product.getName() + ". New Price: " + product.getPrice());
    }


}

