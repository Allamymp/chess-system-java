package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	
	
 
	public Piece(Board board) {
		
		this.board = board;
		this.position = null; // unnecessary declaration, made by remember.
	}


	
	protected Board getBoard() {
		return board;
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
