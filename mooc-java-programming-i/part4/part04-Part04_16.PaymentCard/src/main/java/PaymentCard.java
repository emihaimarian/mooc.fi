/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emiha
 */
public class PaymentCard {

    private double balance;
    private final double affordable;
    private final double heartly;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.60;
        this.heartly = 4.60;
    }

    public void eatAffordably() {

        if (this.balance >= this.affordable) {
            this.balance = this.balance - this.affordable;
        }
    }

    public void eatHeartily() {

        if (this.balance >= this.heartly) {
            this.balance = this.balance - this.heartly;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }


    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

}
