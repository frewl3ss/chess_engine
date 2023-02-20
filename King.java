public class King extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE KING";
        } else {
            return "BLACK KING";
        }
    }

    public King(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 99999;
        } else {
            this.value = -99999;
        }
    }
}
