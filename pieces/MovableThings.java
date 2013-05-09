package pieces;

import gameBoard.GameBoard;
import gameBoard.Location;
import gameBoard.LocationList;

public interface MovableThings {

	public abstract LocationList possibleMoove(GameBoard gameBoard);
	public abstract boolean moove(Location newLocation,LocationList locationList);
}
