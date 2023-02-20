public class Bishop extends Piece {
    public int value;

    public Bishop(boolean isWhite, int position) {
        super(isWhite, position);
        this.type = "BISHOP";
        if(isWhite) {
            this.value = 30;
        } else {
            this.value = -30;
        }
    }
}
