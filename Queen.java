public class Queen extends Piece {
    public int value;

    public Queen(boolean isWhite, int position) {
        super(isWhite, position);
        this.type = "QUEEN";
        if(isWhite) {
            this.value = 90;
        } else {
            this.value = -90;
        }
    }
}
