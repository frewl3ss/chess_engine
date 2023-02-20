public class Knight extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE KNIGHT";
        } else {
            return "BLACK KNIGHT";
        }
    }

    public Knight(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 30;
        } else {
            this.value = -30;
        }
    }
}
