package food_order.entity;

import jakarta.persistence.*;

public abstract class User {

    private Long id;


    private String fullName;


    private String phoneNumber;

    private String email;

    private String password;

    private Profile profile;

    public User(String fullName, String phoneNumber, String email, String password) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public User() {}

    public void setProfile(Profile profile) {this.profile = profile;}
    public Profile getProfile() {return profile;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getFullName() {return fullName;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public String getPhoneNumber() {return phoneNumber;}
    public void setEmail(String email) {this.email = email;}
    public String getEmail() {return email;}
    public void setPassword(String password) {this.password = password;}
    public String getPassword() {return password;}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

