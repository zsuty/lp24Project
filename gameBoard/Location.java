package gameBoard;

public class Location {
	private int line;
	private int column;
	private int height;
	
	public Location(int line,int column,int height){
		this.line =line;
		this.column = column;
		this.height = height;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Location location) {
		if(this.line == location.line && this.column == location.column && this.height == location.height)
			return true;
		return false;
	}
	
	

}
