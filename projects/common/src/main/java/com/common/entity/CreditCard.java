package com.common.entity;

public class CreditCard {
	
	private Long customerId;
	private String name;
	private Long cardNumber;
	private String expiryDate;
	private Integer cvv;
	
	public Long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getExpiryDate() {
		return expiryDate;
	}
	
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Integer getCvv() {
		return cvv;
	}
	
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

}
