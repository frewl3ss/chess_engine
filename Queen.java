public class Queen extends Piece {
    public int value;

    @Override
    public String toString() {
        if (isWhite) {
            return "WHITE QUEEN";
        } else {
            return "BLACK QUEEN";
        }
    }

    public Queen(boolean isWhite, int position) {
        super(isWhite, position);
        if(isWhite) {
            this.value = 90;
        } else {
            this.value = -90;
        }
    }
}
