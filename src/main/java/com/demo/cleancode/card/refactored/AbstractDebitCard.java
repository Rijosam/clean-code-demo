package com.demo.cleancode.card.refactored;

import java.util.List;

public abstract class  AbstractDebitCard extends AbstractCard {
    private String cardStatus;
    private String cardLimit;
    private String dailySpendingLimit;
    private String cardNetwork;
    private List<String> securityFeatures;
    private String billingAddress;
    private List<String> transactionHistory;

}
