public class Pawn extends Piece {
    public int value;

    public Pawn(boolean isWhite, int position) {
        super(isWhite, position);
        this.type = "PAWN";
        if(isWhite) {
            this.value = 10;
        } else {
            this.value = -10;
        }
    }
}
