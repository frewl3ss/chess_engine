public class King extends Piece {
    public int value;

    public King(boolean isWhite, int position) {
        super(isWhite, position);
        this.type = "KING";
        if(isWhite) {
            this.value = 99999;
        } else {
            this.value = -99999;
        }
    }
}
