public class Game {

    public Piece[] board = new Piece[64];

    public void setUpGame() {
        // Place the white pieces
        this.board[0] = new Rook(true, 0);
        this.board[1] = new Knight(true, 1);
        this.board[2] = new Bishop(true, 2);
        this.board[3] = new Queen(true, 3);
        this.board[4] = new King(true, 4);
        this.board[5] = new Bishop(true, 5);
        this.board[6] = new Knight(true, 6);
        this.board[7] = new Rook(true, 7);
        this.board[8] = new Pawn(true, 8);
        this.board[9] = new Pawn(true, 9);
        this.board[10] = new Pawn(true, 10);
        this.board[11] = new Pawn(true, 11);
        this.board[12] = new Pawn(true, 12);
        this.board[13] = new Pawn(true, 13);
        this.board[14] = new Pawn(true, 14);
        this.board[15] = new Pawn(true, 15);

        // Place the black pieces
        this.board[56] = new Rook(false, 0);
        this.board[57] = new Knight(false, 1);
        this.board[58] = new Bishop(false, 2);
        this.board[59] = new Queen(false, 3);
        this.board[60] = new King(false, 4);
        this.board[61] = new Bishop(false, 5);
        this.board[62] = new Knight(false, 6);
        this.board[63] = new Rook(false, 7);
        this.board[48] = new Pawn(false, 8);
        this.board[49] = new Pawn(false, 9);
        this.board[50] = new Pawn(false, 10);
        this.board[51] = new Pawn(false, 11);
        this.board[52] = new Pawn(false, 12);
        this.board[53] = new Pawn(false, 13);
        this.board[54] = new Pawn(false, 14);
        this.board[55] = new Pawn(false, 15);
    }

    public void displayBoard() {
        for (int i = 0; i < 64; i++) {
            try {
                System.out.println(this.board[i].getColour() + this.board[i].getType());
            } catch (NullPointerException e) {
                System.out.println("NULL");
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.setUpGame();
        game.displayBoard();
    }
}
