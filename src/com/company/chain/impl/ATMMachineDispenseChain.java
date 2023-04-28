package com.company.chain.impl;

import com.company.chain.MoneyDispenseChain;

public class ATMMachineDispenseChain {
    public MoneyDispenseChain getMoneyDispenseChain() {
        return moneyDispenseChain;
    }

    private MoneyDispenseChain moneyDispenseChain;
    private MoneyDispenseChain moneyDispenseChain2;
    private MoneyDispenseChain moneyDispenseChain3;
    private MoneyDispenseChain moneyDispenseChain4;

    public ATMMachineDispenseChain(){
        moneyDispenseChain = new Rupees2000Dispenser();
        moneyDispenseChain2 = new Rupees500Dispenser();
        moneyDispenseChain3 = new Rupees200Dispenser();
        moneyDispenseChain4 = new Rupees100Dispenser();

        moneyDispenseChain.setNextChain(moneyDispenseChain2);
        moneyDispenseChain2.setNextChain(moneyDispenseChain3);
        moneyDispenseChain3.setNextChain(moneyDispenseChain4);
    }
}
