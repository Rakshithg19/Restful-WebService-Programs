package raksh.laptop.Laptop_Details;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import raksh.laptop.Laptop_Details.dao.LaptoDAO;
import raksh.laptop.Laptop_Details.dao.LaptopDAOimpl;
import raksh.laptop.Laptop_Details.entity.LaptoEntity;



@Path("laptop")
public class LaptopResource {
	LaptoDAO dao =  new LaptopDAOimpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ResponseBuilder save(List<LaptoEntity> entity) {
		System.out.println("laptop details created");
		dao.save(entity);
		return Response.ok();
	}
	@GET
	@Path("laptops/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public LaptoEntity getLaptoEntity(@PathParam("id") int id)
	{
		return dao.retrieveById(id);
		
	}
}