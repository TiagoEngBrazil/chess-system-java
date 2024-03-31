package boardgame;

public class Board {

	private int rows;
	private int column;
	private Piece[][] pieces;

	public Board(Piece[][] pieces) {
		this.pieces = pieces;

		pieces = new Piece[rows][column];

	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}
	
	
}
