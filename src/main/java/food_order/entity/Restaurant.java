package food_order.entity;

public class Restaurant {
    private String name;
    private String address;
    private String phoneNumber;
    private String openingHours;
    private Menu menu;

    public Restaurant(String name, String address,
                      String phoneNumber, String openingHours, Menu menu) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.openingHours = openingHours;
        this.menu = menu;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getOpeningHours() { return openingHours; }
    public void setOpeningHours(String openingHours) {this.openingHours = openingHours;}
    public Menu getMenu() { return menu; }
    public void setMenu(Menu menu) { this.menu = menu; }
}
