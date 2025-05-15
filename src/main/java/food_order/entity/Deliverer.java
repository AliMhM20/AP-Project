package food_order.entity;

import food_order.interfaces.ProfileWithBankAccount;

public class Deliverer extends User implements ProfileWithBankAccount {
    private String bankAccount = null;

    public Deliverer(String firstName, String lastName, String email, String password) {
        super( firstName, lastName, email, password );
    }

    public String  getBankAccount() { return bankAccount; }
    public void setBankAccount(String bankAccount) { this.bankAccount = bankAccount; }
}
