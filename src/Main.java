import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

public class Main {

    public static void main(String[] args) {


        Grid grid = new Grid(3,3);
        Cursor cursor = new Cursor(grid);
        KeyboardControl keyboard = new KeyboardControl(cursor, grid);

    }
}
