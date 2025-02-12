package smartwarehousemanagementsystem;

import java.util.ArrayList;

public class Storage <T extends WarehouseItem>{
    ArrayList<T> list=new ArrayList<>();

    public void addItem(T item){
        list.add(item);
    }
    public ArrayList<T> getList(){
        return list;
    }
}
