package com.gql.api.resolvers;

import org.springframework.stereotype.Component;

import com.common.entity.CreditCard;
import com.common.entity.Customer;
import com.common.entity.Receiver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class Query implements GraphQLQueryResolver {

	public Customer getCustomer(Long id) {
		Customer customer = new Customer();
		customer.setCustomerId(2001L);
		customer.setName("John Doe");
		customer.setEmail("johndoe@gmail.com");
		customer.setPhone("+1-435 678 1234");
		customer.setAddress("London");
		
		Receiver receiver = new Receiver() ;
		receiver.setAddress("Dublin");
		receiver.setId(1001L);
		receiver.setName("Jane B");
		customer.setReceiver(receiver);
		
		CreditCard creditCard = new CreditCard();
		creditCard.setCardNumber(1111222233334444L);
		creditCard.setCustomerId(2001L);
		creditCard.setCvv(123);
		creditCard.setExpiryDate("01/2022");
		creditCard.setName("John Doe");
		customer.setCreditCard(creditCard);
		return customer;
		
	}
}
