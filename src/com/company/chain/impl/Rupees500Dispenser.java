package com.company.chain.impl;

import com.company.chain.MoneyDispenseChain;
import com.company.currency.Currency;

public class Rupees500Dispenser implements  MoneyDispenseChain{
    private MoneyDispenseChain moneyDispenseChain;
    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 500){
            int noOfNotes = currency.getAmount()/500;
            int remainder = currency.getAmount()%500;
            System.out.println("Dispensing "+ noOfNotes + " Notes of 500 rupees.");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            moneyDispenseChain.dispense(currency);
        }
    }
}
