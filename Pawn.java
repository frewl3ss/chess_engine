public class Pawn extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE PAWN";
        } else {
            return "BLACK PAWN";
        }
    }

    public Pawn(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 10;
        } else {
            this.value = -10;
        }
    }
}
