package gameBoard;

public class gameBoard {
	private FixedLevel [] fixedLevels;
	private MovableLevel [] movableLevels;
	
	public gameBoard(){
		fixedLevels = new FixedLevel[3];
		fixedLevels[0] = new FixedLevel(new Location(1,1,6));
		fixedLevels[1] = new FixedLevel(new Location(3,1,4));
		fixedLevels[2] = new FixedLevel(new Location(5,1,2));
		
		movableLevels = new MovableLevel[4];
		movableLevels[0] = new MovableLevel(new Location(0,0,7));
		movableLevels[1] = new MovableLevel(new Location(0,4,7));
		movableLevels[2] = new MovableLevel(new Location(8,0,1));
		movableLevels[3] = new MovableLevel(new Location(8,4,1));
		
	}
	
	public Square getSquareInFixedLevels(Location location)
	{
		Square s =null;
		int i;
		for(i=0;i<3;i++)
		{
			if(fixedLevels[i].getHeight() == location.getHeight())
			{
				s = fixedLevels[i].getSqare(location);
			}
		}
		return s;
	}
	public Square getSquareInMovableLevels(Location location){
		Square s =null;
		int i;
		for(i=0;i<4;i++)
		{
			if(movableLevels[i].getHeight() == location.getHeight())
			{
				s = movableLevels[i].getSqare(location);
			}
		}
		return s;
	}
	public Square getSquare(Location location){
		switch(location.getHeight()%2)
		{
		case 0:
			return this.getSquareInFixedLevels(location);
		case 1 :
			return this.getSquareInMovableLevels(location);
		default:
			return null;
		}
	}

}
