package com.raksh.DemoRest;

import java.util.ArrayList;
import java.util.List;

public class RakshithRepository {
	List<Rakshith> raksh;
	public RakshithRepository() {
		raksh = new ArrayList<>();
		Rakshith r1 = new Rakshith();
		r1.setId(1);
		r1.setName("rakshith");
		r1.setPoints(60);
		
		Rakshith r2 = new Rakshith();
		r2.setId(2);
		r2.setName("rock");
		r2.setPoints(40);
		raksh.add(r1);
		raksh.add(r2);
	}
	public List<Rakshith> getRakshith()
	{
		return raksh;
		
	}
	public Rakshith getRakshith(int id) {
		
		for(Rakshith r: raksh)
		{
			if(r.getId()==id) 
				return r;
			
		}
		return null;
		}
	public void create(Rakshith r1) {
		raksh.add(r1);
		
	}

}
