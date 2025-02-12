package dynamiconlinemarketplace;


public class Main {
    public static void main(String[] args) {
        // Creating Products
        Product<String> book1 = new Product<>("Java", 455, "Tech");
        Product<String> shirt1 = new Product<>("Casual Shirt", 800, "Men");
        Product<String> phone1 = new Product<>("Smartphone", 34900, "Mobile");
        Product<String> book2 = new Product<>("Python", 600, "Tech");
        Product<String> shirt2 = new Product<>("T-Shirt", 400, "Men");
        Product<String> phone2 = new Product<>("Laptop", 75499, "Pc");

        // Creating Catalogs
        ProductCatalog<String> bookCatalog = new ProductCatalog<>();
        ProductCatalog<String> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<String> gadgetCatalog = new ProductCatalog<>();

        // Adding Products to Catalogs
        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(shirt1);
        gadgetCatalog.addProduct(phone1);
        bookCatalog.addProduct(book2);
        clothingCatalog.addProduct(shirt2);
        gadgetCatalog.addProduct(phone2);

        // Applying Discounts
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(shirt1, 15);
        ProductCatalog.applyDiscount(phone2, 5);

        // Display Products
        System.out.println("Books : ");
        ProductUtil.displayItems(bookCatalog.getProducts());
        System.out.println();
        System.out.println("Clothing: " );
        ProductUtil.displayItems(clothingCatalog.getProducts());
        System.out.println();
        System.out.println("Gadgets: " );
        ProductUtil.displayItems(gadgetCatalog.getProducts());

    }
}