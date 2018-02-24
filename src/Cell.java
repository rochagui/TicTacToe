import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private boolean isPaintedBlue;
    private boolean isPaintedGreen;
    private Rectangle cell;

    public Cell(int col, int row, int width, int height) {
        cell = new Rectangle(col,row,width -20,height -20);

    }

    public void paint(String color){
        if (color == "blue") {
            cell.setColor(Color.BLUE);
            isPaintedBlue = true;
        } else {

            cell.setColor(Color.GREEN);
            isPaintedGreen = true;
        }
        cell.fill();
    }

    public boolean isPaintedBlue(){
        return isPaintedBlue;
    }

    public boolean isPaintedGreen(){
        return isPaintedGreen;
    }
}