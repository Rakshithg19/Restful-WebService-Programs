package raksh.app.Car_Rest_wsr;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
	List<CarDetails> al;
	public CarRepository() {
		al = new ArrayList<CarDetails>();
		CarDetails cd = new CarDetails();
		cd.setId(1);
		cd.setVehicle("Cilerio");
		cd.setMfgYear(2015);
		cd.setVehicleType("Private");
		cd.setLoction("Hsr Layout");
		
		CarDetails cd1 = new CarDetails();
		cd1.setId(2);
		cd1.setVehicle("Verna");
		cd1.setMfgYear(2010);
		cd1.setVehicleType("Taxi");
		cd1.setLoction("Koramangala");
		
		al.add(cd);
		al.add(cd1);
	}
public List<CarDetails> getCarDetails(){
	return al;
}
public CarDetails getCarDetails(int id) {
	for (CarDetails c : al) {
		if(c.getId()==id)
			return c;
	}
	return null;
	
}
public void create(CarDetails cd1) {
	// TODO Auto-generated method stub
	al.add(cd1);
	
}
}
