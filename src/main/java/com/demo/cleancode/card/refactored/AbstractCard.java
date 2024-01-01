package com.demo.cleancode.card.refactored;

public abstract class AbstractCard {
    private String cardColor;
    private String cardDesign;
    private String issuingCountry;
    private String cardActivationDate;
    private String cardBlockReason;
    private String rewardPoints;
    private String cardHolderContactNumber;
    private String customerID;
    private String cardServiceNumber;
    private String cardFeeCategory;

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public String getCardDesign() {
        return cardDesign;
    }

    public void setCardDesign(String cardDesign) {
        this.cardDesign = cardDesign;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public void setIssuingCountry(String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }

    public String getCardActivationDate() {
        return cardActivationDate;
    }

    public void setCardActivationDate(String cardActivationDate) {
        this.cardActivationDate = cardActivationDate;
    }

    public String getCardBlockReason() {
        return cardBlockReason;
    }

    public void setCardBlockReason(String cardBlockReason) {
        this.cardBlockReason = cardBlockReason;
    }

    public String getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(String rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getCardHolderContactNumber() {
        return cardHolderContactNumber;
    }

    public void setCardHolderContactNumber(String cardHolderContactNumber) {
        this.cardHolderContactNumber = cardHolderContactNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCardServiceNumber() {
        return cardServiceNumber;
    }

    public void setCardServiceNumber(String cardServiceNumber) {
        this.cardServiceNumber = cardServiceNumber;
    }

    public String getCardFeeCategory() {
        return cardFeeCategory;
    }

    public void setCardFeeCategory(String cardFeeCategory) {
        this.cardFeeCategory = cardFeeCategory;
    }
}
