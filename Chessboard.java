import java.util.Collections;
import java.util.ArrayList;

public class Chessboard {
    public ArrayList<String> board = new ArrayList<String>();

    public Chessboard() {
        this.board = generateStartingPosition();
    }

    private ArrayList<String> generateStartingPosition() {
        Collections.addAll(this.board, "r", "n", "b", "q", "k", "b", "n", "r");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "-", "-", "-", "-", "-", "-", "-", "-");
        Collections.addAll(this.board, "R", "N", "B", "Q", "K", "B", "N", "R");

        return board;
    }
}
