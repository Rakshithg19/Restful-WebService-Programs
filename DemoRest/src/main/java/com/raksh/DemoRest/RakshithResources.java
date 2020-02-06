package com.raksh.DemoRest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("raksh")
public class RakshithResources {

	RakshithRepository repo = new RakshithRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Rakshith> getRakshith() {
		System.out.println("getRaksh called......");
		return repo.getRakshith();
	}

	@POST
	@Path("rakshg")
	public Rakshith createRakshith(Rakshith r1) {
		System.out.println(r1);
		repo.create(r1);
		return r1;
	}
}
