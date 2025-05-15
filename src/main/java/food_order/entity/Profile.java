package food_order.entity;

import jakarta.persistence.*;


public class Profile {

    private Long id;

    private String profileImagePath;
    private String address;
    private String phoneNumber;
    private String bankAccount;
    private String restaurantDetails;

    private User user;

    public Profile(String profileImagePath, String address, String phoneNumber,
                   String bankAccount, String restaurantDetails) {
        this.profileImagePath = profileImagePath;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
        this.restaurantDetails = restaurantDetails;
    }

    public String getProfileImagePath() { return profileImagePath; }
    public void setProfileImagePath(String profileImagePath) { this.profileImagePath = profileImagePath; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getBankAccount() { return bankAccount; }
    public void setBankAccount(String bankAccount) { this.bankAccount = bankAccount; }
    public String getRestaurantDetails() { return restaurantDetails; }
    public void setRestaurantDetails(String restaurantDetails) { this.restaurantDetails = restaurantDetails; }

    public void setProfile(User user) {user.setProfile(this);}
    public Profile getProfile(User user) {return user.getProfile();}

    public void editProfile(User user , String profileImagePath , String address, String phoneNumber,
                            String bankAccount, String restaurantDetails) {
        Profile oldProfile = this.getProfile(user);
        oldProfile.setProfileImagePath(profileImagePath);
        oldProfile.setAddress(address);
        oldProfile.setPhoneNumber(phoneNumber);
        if (user instanceof Seller || user instanceof Deliverer) {
            oldProfile.setBankAccount(bankAccount);
        }
        if (user instanceof Seller) {
            oldProfile.setRestaurantDetails(restaurantDetails);
        }
    }
}

