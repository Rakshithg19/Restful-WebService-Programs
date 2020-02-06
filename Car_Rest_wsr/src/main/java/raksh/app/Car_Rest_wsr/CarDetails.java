package raksh.app.Car_Rest_wsr;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarDetails {
	private int id;
	@Override
	public String toString() {
		return "CarDetails [id=" + id + ", vehicle=" + vehicle + ", mfgYear=" + mfgYear + ", vehicleType=" + vehicleType
				+ ", loction=" + loction + "]";
	}
	public int getId() {
		return id;
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public int getMfgYear() {
		return mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getLoction() {
		return loction;
	}
	public void setLoction(String loction) {
		this.loction = loction;
	}
	private String vehicle;
	private int mfgYear;
	private String vehicleType;
	private String loction;

}
