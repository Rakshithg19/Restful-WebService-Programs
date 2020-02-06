package raksh.movies.Movie_Details;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("movie")
public class MovieResource {
	MovieRepository repo = new MovieRepository();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<MovieDetails> getMovieDetails() {
		System.out.println("movie details created");
		return repo.getMovieDetails();
	}
	@GET
	@Path("movies/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public MovieDetails getMovieDetails(@PathParam("id") int id)
	{
		return repo.getMovieDetails(id);
}
	
	
	@POST
	@Path("movies")
	@Consumes(MediaType.APPLICATION_JSON)
	public MovieDetails createMovieDetails(MovieDetails md) {
		System.out.println(md);
		repo.create(md);
		return md;
	}
	@PUT
	@Path("movies")
	@Consumes(MediaType.APPLICATION_JSON)
	public MovieDetails updateMovieDetails(MovieDetails md) {
		System.out.println(md);
		if(repo.getMovieDetails(md.getMovieid()).getMovieid()==0)
		{ repo.create(md);
		
		}
		else
		{
			repo.update(md);
		}
		return md;
	}
@DELETE
@Path("movies/{id}")
public MovieDetails deleteMovieDetails(@PathParam("id") int id) {
	
MovieDetails md = repo.getMovieDetails(id);
if(md.getMovieid()!=0)
repo.delete(id);
return md;
}
}

