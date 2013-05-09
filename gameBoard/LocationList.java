package gameBoard;


import java.util.ArrayList;
import java.util.Iterator;



public class LocationList extends ArrayList <Location>{
	

	public LocationList(){
		super();
	}
	
	public boolean isIn (Location location)
	{
		boolean is = false;
		Iterator<Location> l = this.iterator();
		while(l.hasNext() && !is)
		{
			if(l.next().equals(location))
				is = true;
		}
		return is;
		
	}
}
