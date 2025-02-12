package personalizedmealplangenerator;

import java.util.ArrayList;

public class Meal <T extends MealPlan> {
    ArrayList<T> list = new ArrayList<>();

    public void addItem(T item) {
        list.add(item);
    }

    public ArrayList<T> getItem() {
        return list;
    }

    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T item : list) {
            sb.append("- ").append(item.getName()).append("\n");  // Uses getName() instead of name
        }
        return sb.toString();
    }

}
