public class Knight extends Piece {
    public int value;

    public Knight(boolean isWhite, int position) {
        super(isWhite, position);
        this.type = "KNIGHT";
        if(isWhite) {
            this.value = 30;
        } else {
            this.value = -30;
        }
    }
}
