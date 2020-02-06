package raksh.movies.Movie_Details;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@XmlRootElement
public class MovieDetails {
	private int movieid;
	private String city;
	private String movieName;
	private String place;
	private double timimgs;
	
}
