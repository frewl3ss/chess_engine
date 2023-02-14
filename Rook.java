public class Rook extends Piece {
    public int value;

    public Rook(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 50;
        } else {
            this.value = -50;
        }
    }
}
