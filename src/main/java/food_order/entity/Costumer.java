package food_order.entity;

public class Costumer extends User{
    private String address;

    public Costumer( String fullName , String phoneNumber , String email , String password , String address) {
        super(fullName , phoneNumber , email , password);
        this.address = address;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
