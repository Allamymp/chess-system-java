package boardgame;

public class Piece {
	
	protected Position position;
	
	
	
	
	public Piece(Position position) {
	 
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public boolean[][] possibleMoves() {
		
		return null;
	}
	
	public boolean possibleMove() {
		
		return true;
	}
	
	 public boolean isThereAnyPossibleMove(){
		 
		 return true;
	 }
	
	

}
