public interface Chess {
    int noteRow();
    int noteColumn();
    String noteColor();
    boolean canMove(int row, int col);
    boolean mayDefeat(Chess piece);
}