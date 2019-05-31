package com.qa.rest;



import java.net.URI;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.qa.model.Account;
import com.qa.repo.AccountRepo;
import com.qa.repo.Relation;

@Path(value = "/")// Go down this path after APi
public class AccountEndPoints {
	
@Inject
private Relation relation;
@Inject
private AccountRepo accountRepo;
	
	@GET
	@Path("/account") //Go down this path if our path goes down account
	@Produces(MediaType.TEXT_PLAIN)
	public Response getText()
	{
		String text = relation.message();
		return Response.ok(text).build();
	}
	
	@POST
	@Path("/account")
	@Consumes({"application/json"})
	public Response creatAccount(Account account, @Context UriInfo uriInfo)
	{
		Account retrieved = accountRepo.createAccount(account);
		System.out.println(retrieved.getId());
		System.out.println(retrieved.getFirstName());
		URI uri = uriInfo.getBaseUriBuilder().path(""+retrieved.getId()).build();
		return Response.created(uri).build();
	}
	
}
