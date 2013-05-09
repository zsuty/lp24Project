package pieces;


import gameBoard.Location;
import gameBoard.LocationList;

import java.awt.Color;


public abstract class Piece implements MovableThings {
	protected Location location;
	protected final Color color;

	public Piece(Location location,Color color){
		this.location = location;
		this.color = color;
		
	}
	
	public Color getColor() {
		return color;
	}
	
	
	public void setLocation(Location location) {
		this.location = location;
	}
	public Location getLocation() {
		return location;
	}
	
	public boolean moove(Location newLocation,LocationList locationList){
		if(locationList.isIn(newLocation))
		{
			this.setLocation(newLocation);
			return true;
		}
		return false;
	}
}
