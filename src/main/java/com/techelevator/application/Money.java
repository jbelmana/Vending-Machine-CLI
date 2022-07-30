package com.techelevator.application;

import com.techelevator.VendingMachineCLI;
import com.techelevator.ui.UserInput;

import java.math.BigDecimal;

public class Money {

    public static BigDecimal balance = new BigDecimal("0.00");

    public static BigDecimal getBalance() {
        return balance;
    }

    public Money() {
        this.balance = getBalance();
    }

    public static void addMoney(BigDecimal depositAmount){
        balance = balance.add(depositAmount);
    }
    public void spendMoney(BigDecimal price){
        balance = balance.subtract(price);
    }

    public static String balanceString(){
        String balanceString = "Current Money Provided: $" + balance;
        return balanceString;
    }

    public static String change() {
        BigDecimal coins = getBalance();

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        String changeReturned = "";

        BigDecimal dollar = new BigDecimal("1.00");
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");

        BigDecimal currentBalance = getBalance();

        coins.remainder(new BigDecimal("1.00"));

        while(coins.compareTo(new BigDecimal("0"))>0){
            if(coins.compareTo(dollar) >= 0){
                dollars++;
                coins = coins.subtract(dollar);
            }else if(coins.compareTo(quarter) >= 0){
                quarters++;
                coins = coins.subtract(quarter);
            }else if(coins.compareTo(dime) >= 0){
                dimes++;
                coins = coins.subtract(dime);
            }else if(coins.compareTo(nickel) >= 0){
                nickels++;
                coins = coins.subtract(nickel);
            }
        }
        changeReturned = "Change returned: " + dollars + " dollars, " + quarters + " quarters, "
        + dimes + " dimes, and " + nickels + " nickels." ;
        return changeReturned;
    }
}
