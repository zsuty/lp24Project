package gameBoard;

import java.awt.Color;

public abstract class Level {
	protected int height;
	protected Square[][] squareArray;
	protected int nbLine;
	protected int nbColumn;
	
	public Level (int nbLine, int nbColumn,Location locationFirstSquare){
		this.nbLine = nbLine;
		this.nbColumn = nbColumn;
		this.height = locationFirstSquare.getHeight();
		squareArray = new Square[nbLine][nbColumn];
		int i,j;
		for(i=0;i<nbLine;i++)
		{
			for(j=0;j<nbColumn;j++)
			{
				if((i+j)%2 == 0)
					squareArray[i][j] = new Square(new Location(locationFirstSquare.getLine()+i,locationFirstSquare.getColumn()+j,locationFirstSquare.getHeight()),Color.white);
				else
					squareArray[i][j] = new Square(new Location(locationFirstSquare.getLine()+i,locationFirstSquare.getColumn()+j,locationFirstSquare.getHeight()),Color.black);
				
			}
		}
	}
	
	public Square getSqare(Location location){
		if(location.getHeight()==this.height)
		{
			int x =location.getLine()-squareArray[0][0].getLocation().getLine(),y = location.getColumn() - squareArray[0][0].getLocation().getColumn();
			if( (x>=0&&x<nbLine)&&(y>=0 && y < nbColumn))
				return squareArray[x][y];
			return null;
		}
		return null;
	}
	public int getNbLine() {
		return nbLine;
	}
	public int getNbColumn() {
		return nbColumn;
	}
	public int getHeight() {
		return height;
	}
	
	
}
