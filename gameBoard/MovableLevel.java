package gameBoard;

import java.awt.Color;

import pieces.MovableThings;

public class MovableLevel extends Level implements MovableThings{
	public MovableLevel(Location locationFirstSquare){
		super(2,2,locationFirstSquare);
	}
	public void setHeight(int height) {
		this.height = height;
		int i,j;
		for(i=0;i<nbLine;i++)
		{
			for(j=0;j<nbColumn;j++)
			{
				squareArray[i][j].getLocation().setHeight(height);
			}
		}
	}
	
	public void setNewFirstSquare(Location newFirstSquare){
		this.height = newFirstSquare.getHeight();
		int i,j;
		for(i=0;i<this.nbLine;i++)
		{
			for(j=0;j<this.nbColumn;j++)
			{
				this.squareArray[i][j].setLocation(new Location(newFirstSquare.getLine()+i,newFirstSquare.getColumn()+j,newFirstSquare.getHeight()));
			}
		}
	}
	public boolean isMovable(Color color){
		boolean isMovable = true;
		int i = 0,j = 0,count = 0;
		
		while(i<this.nbLine && isMovable)
		{
			while(j<this.nbColumn && isMovable)
			{
				if(squareArray[i][j].getPiece() != null)
				{
					if(squareArray[i][j].getPiece().getColor().equals(color))
						count++;
					else
						isMovable = false;
				}
				if(count>1)
					isMovable = false;
				
				j++;
			}
			i++;
		}
		return isMovable;
	}
	public LocationList possibleMoove(){
		/* TODO */
	}
	public boolean moove(Location newLocation,LocationList locationList){
		if(locationList.isIn(newLocation))
		{
			this.setNewFirstSquare(newLocation);
			return true;
		}
		return false;
	}

}
