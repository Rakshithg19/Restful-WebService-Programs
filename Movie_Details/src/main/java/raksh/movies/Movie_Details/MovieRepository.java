package raksh.movies.Movie_Details;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;



public class MovieRepository {
	
	Connection con = null;
	
	public MovieRepository()  {
		String url="jdbc:mysql://localhost:3306/restdb";
		String username = "root";
		String password = "Rakshrcb8$";
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e);
		
		}
	}
	
	public List<MovieDetails> getMovieDetails() {
		List<MovieDetails> mv = new ArrayList<>();
		String sql = "select * from movieDetails";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				MovieDetails m = new MovieDetails();
				m.setMovieid(rs.getInt(1));
				m.setCity(rs.getString(2));
				m.setMovieName(rs.getString(3));
				m.setPlace(rs.getString(4));
				m.setTimimgs(rs.getDouble(5));
				mv.add(m);
			}
		} catch (Exception e) {
			System.out.println(e);
		
		}
	return mv;
}
	public MovieDetails getMovieDetails(int id) {
		String sql = "select * from movieDetails where id=+id";
		MovieDetails m = new MovieDetails();
		try {
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				
				m.setMovieid(rs.getInt(1));
				m.setCity(rs.getString(2));
				m.setMovieName(rs.getString(3));
				m.setPlace(rs.getString(4));
				m.setTimimgs(rs.getDouble(5));
			
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(); 
		}
		return m;
		}
	
	public void create(MovieDetails md) {
		String sql = "insert into MovieDetails values(?,?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,md.getMovieid());
			st.setString(2,md.getCity());
			st.setString(3,md.getMovieName());
			st.setString(4, md.getPlace());
			st.setDouble(5, md.getTimimgs());
			st.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace(); 
		}
	}
		public void update(MovieDetails md) {
			String sql = "update MovieDetails set movieName=?, city=?, place=?, timimgs=? where movieid=?";
			try {
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1,md.getMovieName());
			
				st.setString(2,md.getCity());
				st.setString(3, md.getPlace());
				st.setDouble(4 , md.getTimimgs());
				st.setInt(5,md.getMovieid());
				
				st.executeUpdate();
				
				
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace(); 
			}
		
	}
		public void delete(int movieid) {
			String sql = "delete from MovieDetails  where movieid=?";
			try {
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setInt(1,movieid);
				st.executeUpdate();
				
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace(); 
			}
		
	}
		}
