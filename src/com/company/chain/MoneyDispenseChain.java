package com.company.chain;

import com.company.currency.Currency;

public interface MoneyDispenseChain {
    void setNextChain(MoneyDispenseChain moneyDispenseChain);
    void dispense(Currency currency);
}
