package com.company.chain.impl;

import com.company.chain.MoneyDispenseChain;
import com.company.currency.Currency;

public class Rupees2000Dispenser implements MoneyDispenseChain {

    private MoneyDispenseChain moneyDispenseChain;
    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 2000){
            int noOfNotes = currency.getAmount()/2000;
            int remainder = currency.getAmount()%2000;
            System.out.println("Dispensing "+ noOfNotes + " Notes of 2000 rupees.");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            moneyDispenseChain.dispense(currency);
        }
    }
}
