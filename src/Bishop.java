public class Bishop extends Parent {
    public Bishop(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.noteRow() == row && piece.noteColumn() == col) return false;
        }if (row > 7 || row < 0) return false;
        if (col > 7 || col < 0) return false;
        return (Math.abs(row - this.noteRow()) == Math.abs(col - this.noteColumn()) && row != this.noteRow() && col != this.noteColumn());
    }

    public boolean mayDefeat(Chess piece) {
        return (Math.abs(piece.noteRow() - this.noteRow()) == Math.abs(piece.noteColumn() - this.noteColumn()) && piece.noteRow() != this.noteRow() && piece.noteColumn() != this.noteColumn() && !piece.noteColor().equals(this.noteColor()));
    }
}