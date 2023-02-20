public class Piece {
    public boolean isWhite; // True for white pieces; false for black pieces
    public int position; // Value 0-63 to store where on the board the piece is


    public Piece(boolean isWhite, int position) {
        this.isWhite = isWhite;
        this.position = position;
    }
}
