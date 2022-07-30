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

    public static void spendMoney(BigDecimal price){balance = balance.subtract(price);}

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
        String changeReturned = "";

        BigDecimal dollar = new BigDecimal("1.00");
        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");

        BigDecimal currentBalance = balance;

        coins.remainder(new BigDecimal("1.00"));
        Audit.timedAudit("CHANGE GIVEN:" , balance, new BigDecimal("0"));

        while(balance.compareTo(new BigDecimal("0"))>0){
            if(balance.compareTo(dollar) >= 0){
                dollars++;
                balance = balance.subtract(dollar);
            }else if(balance.compareTo(quarter) >= 0){
                quarters++;
                balance = balance.subtract(quarter);
            }else if(balance.compareTo(dime) >= 0){
                dimes++;
                balance = balance.subtract(dime);
            }else if(balance.compareTo(nickel) >= 0){
                nickels++;
                balance = balance.subtract(nickel);
            }
        }
        changeReturned = "Change returned: " + dollars + " dollars, " + quarters + " quarters, "
        + dimes + " dimes, and " + nickels + " nickels." ;
        return changeReturned;
    }
}
