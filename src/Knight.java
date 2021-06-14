public class Knight extends Parent {
    public Knight(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.noteRow() == row && piece.noteColumn() == col) return false;
        }
        if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        if (Math.abs(row - this.noteRow()) == 2 && Math.abs(col - this.noteColumn()) == 1) return true;
        return (Math.abs(row - this.noteRow()) == 1 && Math.abs(col - this.noteColumn()) == 2);
    }

    public boolean mayDefeat(Chess piece) {
        if (Math.abs(piece.noteRow() - this.noteRow()) == 2 && Math.abs(piece.noteColumn() - this.noteColumn()) == 1 && !piece.noteColor().equals(this.noteColor())) return true;
        return (Math.abs(piece.noteRow() - this.noteRow()) == 1 && Math.abs(piece.noteColumn() - this.noteColumn()) == 2 && !piece.noteColor().equals(this.noteColor()));
    }
}