package food_order.entity;

import java.util.*;

public class Menu {
    private HashMap<String , Food> foods;
    public Menu() {foods = new HashMap<>();}

    public void addFood(String name , Food food) { foods.put(name , food); }
    public void removeFood(String name) { foods.remove(name); }
    public Food getFood(String name) { return foods.get(name); }
    public HashMap<String , Food> getFoods() { return foods; }
}
