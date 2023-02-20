public class Bishop extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE BISHOP";
        } else {
            return "BLACK BISHOP";
        }
    }

    public Bishop(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 30;
        } else {
            this.value = -30;
        }
    }
}
