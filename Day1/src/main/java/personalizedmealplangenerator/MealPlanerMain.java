package personalizedmealplangenerator;

public class MealPlanerMain {
    public static void main(String[] args) {
VeganMeal veganMeal1=new VeganMeal("Aalu pratha");
VeganMeal veganMeal2=new VeganMeal("Tofu");
VeganMeal veganMeal3=new VeganMeal("Chole bhature");
VegetarianMeal vegetarianMeal1=new VegetarianMeal("Palak Paneer");
VegetarianMeal vegetarianMeal2=new VegetarianMeal("Pizza");
Meal<VegetarianMeal> vegetarianMealList=new Meal<>();
Meal<VeganMeal> veganMealList =new Meal<>();
veganMealList.addItem(veganMeal1);
        veganMealList.addItem(veganMeal2);
        veganMealList.addItem(veganMeal3);
        vegetarianMealList.addItem(vegetarianMeal1);
        vegetarianMealList.addItem(vegetarianMeal2);
        System.out.println("List of vegan items");
        System.out.println(veganMealList);
        System.out.println("List of vegetarian items");

        System.out.println(vegetarianMealList);

    }
}
