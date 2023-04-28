package com.company.chain.impl;

import com.company.chain.MoneyDispenseChain;
import com.company.currency.Currency;

public class Rupees200Dispenser implements MoneyDispenseChain{
    private MoneyDispenseChain moneyDispenseChain;
    @Override
    public void setNextChain(MoneyDispenseChain moneyDispenseChain) {
        this.moneyDispenseChain = moneyDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 200){
            int noOfNotes = currency.getAmount()/200;
            int remainder = currency.getAmount()%200;
            System.out.println("Dispensing "+ noOfNotes + " Notes of 200 rupees.");
            if(remainder !=0){
                moneyDispenseChain.dispense(new Currency(remainder));
            }
        } else {
            moneyDispenseChain.dispense(currency);
        }
    }
}
