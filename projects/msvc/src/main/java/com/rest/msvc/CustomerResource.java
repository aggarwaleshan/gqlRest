package com.rest.msvc;

import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.common.entity.Customer;
import com.rest.dao.CustomerDAO;

@Named
@Path("/customer")
public class CustomerResource {

    @Autowired
    CustomerDAO customerDao;
    
    @GET
    public String hello() {
        return "Hello Customer!";
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") Long id) {
    	Customer customer = customerDao.find(id);
    	if (customer == null) {
    		return Response.status(Status.NOT_FOUND).build();
    	}
    	return Response.ok(customer).build();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Customer customer) {
    	return Response.ok(customerDao.create(customer)).status(Status.CREATED).build();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Customer customer) {
    	customerDao.update(customer);
    	return Response.status(Status.NO_CONTENT).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") Long id) {
    	customerDao.delete(id);
    	return Response.status(Status.NO_CONTENT).build();
    }
    
}
