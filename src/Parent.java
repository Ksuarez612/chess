import java.util.ArrayList;
public abstract class Parent implements Chess {
    protected int r;

    protected int c;

    protected String color;
    public static ArrayList<Chess> pieces = new ArrayList<>();
    public Parent(int row, int col, String color) {
        r = row;
        c = col;
        this.color = color;
    }public int noteRow() {
        return r;
    }public int noteColumn() {
        return c;
    }public String noteColor() {
        return color;
    }
}