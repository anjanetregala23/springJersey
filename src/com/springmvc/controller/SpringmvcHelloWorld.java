package com.springmvc.controller;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pojo.test.POJO;

@Path("/welcome")
public class SpringmvcHelloWorld {

	/*@GET
	@Path("/{parameter}")
	public Response responseMsg( @PathParam("parameter") String parameter,
			@DefaultValue("Nothing to say") @QueryParam("value") String value) {

		String output = "Hello from : " + parameter + " : " + value;
		return Response.status(200).entity(output).build();
	}*/
	
	@GET
	@Path("/pojo")
	@Produces(MediaType.APPLICATION_JSON)
	public POJO showMusic(){		
		POJO music = new POJO();
		music.setSong("Out of the woods");
		music.setSinger("Taylor Swift");
		return music;
		
	}
}
