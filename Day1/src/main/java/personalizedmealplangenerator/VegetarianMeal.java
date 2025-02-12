package personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan{
    String name;
    VegetarianMeal(String name){
        this.name=name;
    }

    @Override
    public void showMeal() {
        System.out.println("Its a VegetarianMeal");

    }

    @Override
    public String getName() {
        return name;
    }

}
