package gameBoard;

import java.awt.Color;

import pieces.Piece;

public class Square {
	private Location location;
	private Color color;
	private Piece piece;
	
	public Square (Location location,Color color){
		this.setLocation(location);
		this.setColor(color);
		this.piece = null;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public boolean isPiece(){
		return (piece != null);
	}
}
