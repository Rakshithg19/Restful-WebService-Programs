package raksh.app.Car_Rest_wsr;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import raksh.movies.Movie_Details.MovieDetails;
@Path("raksh")
public class CarResource {
	
	CarRepository repo = new CarRepository();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<CarDetails> getCarDetails() {
		System.out.println("car details called");
		return  repo.getCarDetails();
	
	}
		@GET
		@Path("rakshg/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public CarDetails getCarDetails(@PathParam("id") int id) 
		{
			return repo.getCarDetails(id);
		}
		
	@POST
	@Path("rakshg")
	@Consumes(MediaType.APPLICATION_JSON)
	
	public CarDetails createCarDetails(CarDetails cd1) 
	{
		System.out.println(cd1);
		repo.create(cd1);
		return cd1;
	}
	
	

}
