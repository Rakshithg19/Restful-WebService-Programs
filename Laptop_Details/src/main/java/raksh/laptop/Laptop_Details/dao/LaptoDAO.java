package raksh.laptop.Laptop_Details.dao;

import java.util.List;

import raksh.laptop.Laptop_Details.entity.LaptoEntity;

public interface LaptoDAO {
	public void save(List <LaptoEntity> entity);
	
	public LaptoEntity retrieveById(int id);
	public void updateRow(String newName, int id);
	public void deleteRowById(int id);

	
}
