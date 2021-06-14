public class Pawn extends Parent {
    public Pawn(int row, int col, String color) {
        super(row, col, color);
    }

    public boolean canMove(int row, int col) {
        for (Chess piece : pieces) {
            if (piece.noteRow() == row && piece.noteColumn() == col) return false;
        } if (this.noteRow() >= 7 || this.noteRow() <= 0) return false;
        if (this.noteColumn() != col) return false;
        if (this.noteColor().equals("White") && this.noteRow() == 1 && (row - this.noteRow() > 2 || row - this.noteRow() < 1)) return false;
        if (this.noteColor().equals("Black") && this.noteRow() == 1 && (row - this.noteRow() < -2 || row - this.noteRow() > -1)) return false;
        if (this.noteColor().equals("White") && row - this.noteRow() != 1) return false;
        if (this.noteColor().equals("Black") && row - this.noteRow() != -1) return false;
        return true;
    }

    public boolean mayDefeat(Chess piece) {
        if (this.noteColor().equals("White") && Math.abs(piece.noteColumn() - this.noteColumn()) == 1 && piece.noteRow() - this.noteRow() == 1 && piece.noteColor().equals("Black")) return true;
        return (this.noteColor().equals("Black") && Math.abs(piece.noteColumn() - this.noteColumn()) == 1 && piece.noteRow() - this.noteRow() == -1 && piece.noteColor().equals("White"));
    }
}