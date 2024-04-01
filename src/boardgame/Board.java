package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
	}

	public Piece[][] getPieces() {
		return pieces;
	}

	public void setPieces(Piece[][] pieces) {
		this.pieces = pieces;
	}

	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
		
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}









