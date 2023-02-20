public class Piece {
    public boolean isWhite; // True for white pieces; false for black pieces
    public int position; // Value 0-63 to store where on the board the piece is
    public String type; // Stores the piece type so that it can be printed
    public String colour; // Stores the colour as a String so it can be printed

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public Piece(boolean isWhite, int position) {
        this.isWhite = isWhite;
        this.position = position;
        if (isWhite) {
            colour = "WHITE";
        } else {
            colour = "BLACK";
        }
    }
}
