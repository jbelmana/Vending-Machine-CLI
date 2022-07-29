package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.math.BigDecimal;

public class Money {

    public BigDecimal balance = new BigDecimal("0.00");
    public Money(){
        this.balance = getBalance();
    }
    public BigDecimal getBalance(){
        return balance;
    }

    public void addMoney(BigDecimal amountDeposit){
        balance = balance.add(amountDeposit);
    }

    public void spendMoney(BigDecimal price){
        balance = balance.subtract(price);
    }

    public String currentMoney(){
        String balanceString = "Current Money Provided: $" + getBalance().divide(new BigDecimal("100"));
        return balanceString;
    }

    public String change(){

    }
    //gets current balance
    public void feedMoney () {
        String input = UserInput.getHomeScreenOption();

        // if input == "M"
        //  add  money to balance
        /**/


    }


    //Add to balance

    //Subtract

    //private
    // nickle = 0.05
    // dime = 0.10
    // qtr = 0.25
    //dollar = 1.00


    // convert to smallest amount of coins(CHANGE)

    //return change


}
