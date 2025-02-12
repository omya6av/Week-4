package dynamiconlinemarketplace;

import java.util.List;

public class ProductUtil {
    public static void displayItems(List<? extends Product> items) {
        for (Product item : items) {
            System.out.println("Product name :"+item.getName()+" \nPrice : "+item.getPrice());
        }
    }
}
