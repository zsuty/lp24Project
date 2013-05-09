package pieces;

import gameBoard.Location;
import gameBoard.LocationList;

public interface MovableThings {

	public abstract LocationList possibleMoove();
	public abstract boolean moove(Location newLocation,LocationList locationList);
}
