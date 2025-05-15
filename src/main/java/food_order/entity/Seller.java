package food_order.entity;

import food_order.interfaces.*;
import jakarta.persistence.*;

public class Seller extends User implements SellerProfile , ProfileWithBankAccount {

    private Long id;


    private String address;


    private String bankAccount = null;


    private String restaurantDetails;

    public Seller(String fullName , String phoneNumber , String email , String password , String address) {
        super(fullName , phoneNumber , email , password);
        this.address = address;
    }

    public Seller() {
        super();
    }

    public String getRestaurantDetails() { return restaurantDetails; }
    public void setRestaurantDetails(String restaurantDetails) { this.restaurantDetails = restaurantDetails; }
    public String getBankAccount() { return bankAccount; }
    public void setBankAccount(String bankAccount) { this.bankAccount = bankAccount; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
