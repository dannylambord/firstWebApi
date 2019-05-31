package com.qa.rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/")// Go down this path after APi
public class AccountEndPoints {
	
	@GET
	@Path("/account") //Go down this path if our path goes down account
	@Produces(MediaType.TEXT_PLAIN)
	public Response getText()
	{
		String text = "Hello, World";
		return Response.ok(text).build();
	}
}
