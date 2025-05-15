package food_order.entity;

import java.util.HashSet;

public class Food {
    private String name;
    private String foodImagePath;
    private String description;
    private int price;
    private int quantity;
    private String category;
    private HashSet<String> keyWords;

    public Food(String name, String foodImagePath, String description,
                int price, int quantity, String category) {
        this.name = name;
        this.foodImagePath = foodImagePath;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.keyWords = new HashSet<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFoodImagePath() { return foodImagePath; }
    public void setFoodImagePath(String foodImagePath) { this.foodImagePath = foodImagePath; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public HashSet<String> getKeyWords() { return keyWords; }
    public void addKeyWord(String keyWord) { this.keyWords.add(keyWord); }
    public void removeKeyWord(String keyWord) { this.keyWords.remove(keyWord); }
}
