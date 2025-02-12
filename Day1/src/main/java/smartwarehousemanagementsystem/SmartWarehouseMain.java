package smartwarehousemanagementsystem;

public class SmartWarehouseMain {
    public static void main(String[] args) {
        Electronics television1=new Electronics("Lenovo");
        Electronics television2=new Electronics("LG");
        Groceries groceries1=new Groceries("Sugar");
        Groceries groceries2=new Groceries("Coffee");
        Furniture furniture1=new Furniture("Bed");


        Storage<Electronics> storageElectronics=new Storage<>();

        Storage<Groceries> storageGroceries=new Storage<>();

        Storage<Furniture> storageFurniture=new Storage<>();


        storageFurniture.addItem(furniture1);
        System.out.println(storageFurniture.getList());
        storageElectronics.addItem(television1);
        storageElectronics.addItem(television2);
        System.out.println(storageElectronics.getList());
        storageGroceries.addItem(groceries1);
        storageGroceries.addItem(groceries2);
        System.out.println(storageGroceries.getList());
    }
}
