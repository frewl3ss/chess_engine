public class Rook extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE ROOK";
        } else {
            return "BLACK ROOK";
        }
    }

    public Rook(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 50;
        } else {
            this.value = -50;
        }
    }
}
