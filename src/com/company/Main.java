package com.company;


import com.company.chain.MoneyDispenseChain;
import com.company.chain.impl.ATMMachineDispenseChain;
import com.company.currency.Currency;

public class Main {
    public static void main(String[] args) {
        ATMMachineDispenseChain atmMachineDispenseChain = new ATMMachineDispenseChain();
        Currency currency = new Currency(10000);
        atmMachineDispenseChain.getMoneyDispenseChain().dispense(currency);
    }
}
