package pieces;

import java.awt.Color;

import gameBoard.GameBoard;
import gameBoard.Location;
import gameBoard.LocationList;
import gameBoard.Square;

public class Pawn extends Piece {
	private boolean alreadyMooved;
	public Pawn (Location location,Color color,GameBoard gameBoard){
		super(location,color,gameBoard);
		alreadyMooved = false;
	}
	
	public LocationList possibleMoove(GameBoard gameBoard){
		int direction = 1;
		Square tempSquare;
		LocationList list = new LocationList();
		if(this.color.equals(Color.white))
			direction = -1;
		
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn(),this.location.getHeight()));
		if( tempSquare != null)
		{
			if(!tempSquare.isPiece())
				list.add(tempSquare.getLocation());
		}
		
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn(),this.location.getHeight()-direction));
		if( tempSquare != null)
		{
			if(!tempSquare.isPiece())
				list.add(tempSquare.getLocation());
		}
		
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn()+1,this.location.getHeight()));
		if( tempSquare != null)
		{
			if(tempSquare.isPiece())
			{
				if(!tempSquare.getPiece().getColor().equals(this.color))
					list.add(tempSquare.getLocation());
			}
		}
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn()-1,this.location.getHeight()));
		if( tempSquare != null)
		{
			if(tempSquare.isPiece())
			{
				if(!tempSquare.getPiece().getColor().equals(this.color))
					list.add(tempSquare.getLocation());
			}
		}
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn()+1,this.location.getHeight()-direction));
		if( tempSquare != null)
		{
			if(tempSquare.isPiece())
			{
				if(!tempSquare.getPiece().getColor().equals(this.color))
					list.add(tempSquare.getLocation());
			}
		}
		tempSquare = gameBoard.getSquare(new Location(this.location.getLine()+direction,this.location.getColumn()-1,this.location.getHeight()-direction));
		if( tempSquare != null)
		{
			if(tempSquare.isPiece())
			{
				if(!tempSquare.getPiece().getColor().equals(this.color))
					list.add(tempSquare.getLocation());
			}
		}
		
		return list;
	}
	public boolean moove(Location newLocation,LocationList locationList){
		super.moove(newLocation, locationList);
		this.alreadyMooved = true;
		return super.moove(newLocation, locationList);
	}

}
