import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private boolean isPainted;
    private Rectangle cell;



    public Cell(int col, int row, int width, int height) {
        cell = new Rectangle(col,row,width -20,height -20);
        isPainted = false;




    }


    public void paint(String color){
        if (color == "blue") {
            cell.setColor(Color.BLUE);
        } else {
            cell.setColor(Color.GREEN);
        }
        cell.fill();
        isPainted = true;
    }

    public boolean isPainted(){
        return isPainted;
    }


}
