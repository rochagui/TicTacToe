import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor  {

    private int col;
    private int row;
    private Grid grid;
    private Rectangle cursor;


    public Cursor(Grid grid) {
        this.grid = grid;
        col = 0;
        row = 0;

        cursor = new Rectangle(col+Grid.PADDING,row+Grid.PADDING, Grid.CELL_SIZE - 20,Grid.CELL_SIZE -20);
        cursor.setColor(Color.BLUE);
        cursor.draw();

    }

    public void moveUp(){
        if(row == 0){
            return;
        }
        row--;
        cursor.translate(0, -(Grid.CELL_SIZE));
    }

    public void moveDown(){
        if(row == grid.getRows()-1){
            return;
        }
        row++;
        cursor.translate(0, (Grid.CELL_SIZE));
    }

    public void moveLeft(){

        if (col == 0){
            return;
        }
        col--;
        cursor.translate(-(Grid.CELL_SIZE),0);

    }

    public void moveRight(){
        if(col == grid.getCols()-1){
            return;
        }
        col++;
        cursor.translate(Grid.CELL_SIZE,0);

    }

    public void space(){

        Cell cell = grid.getCell(col,row);
        if (!cell.isPainted()){
            cell.paint("blue");
            gameTurn();
        } else {
            return;
        }

    }

    private void gameTurn() {

        Cell cell = grid.getCell((int) Math.floor(Math.random() * 3),(int) Math.floor(Math.random() * 3));
        if (!cell.isPainted()){
            cell.paint("green");
        }else {
            gameTurn();
        }

    }
    }