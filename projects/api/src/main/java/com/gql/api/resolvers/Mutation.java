package com.gql.api.resolvers;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.rest.entity.CustomerInput;
import com.rest.entity.Response;

@Component
public class Mutation implements GraphQLMutationResolver {
	
	public Response saveCustomer(CustomerInput request) {
		Response res = new Response();
		res.setCustomerId(1L);
		res.setMessage("Success");
		return res;
	}

}
