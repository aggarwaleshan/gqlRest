package com.rest.entity;

public class CustomerInput {
	
	private Long customerId;
	private String name;
	private String phone;
	private String email;
	private String address;
	private ReceiverInput receiver;
	private CreditCardInput creditCard;
	
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
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ReceiverInput getReceiver() {
		return receiver;
	}
	
	public void setReceiver(ReceiverInput receiver) {
		this.receiver = receiver;
	}
	
	public CreditCardInput getCreditCard() {
		return creditCard;
	}
	
	public void setCreditCard(CreditCardInput creditCard) {
		this.creditCard = creditCard;
	}

}
