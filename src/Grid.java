import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private int cols;
    private int rows;
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 200;
    private Cell[][] cells;
    private boolean winner = false;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        createGrid();
        init();

    }



    private void createGrid(){

        Rectangle grid = new Rectangle(PADDING,PADDING,cols * CELL_SIZE,rows * CELL_SIZE);
        grid.setColor(Color.WHITE);
        grid.draw();

        Line lineVert1 = new Line(200,10,200,600);
        lineVert1.setColor(Color.BLACK);
        lineVert1.draw();

        Line lineVert2 = new Line(400,10,400,600);
        lineVert2.setColor(Color.BLACK);
        lineVert2.draw();


        Line lineHoriz1 = new Line(10,200,600,200);
        lineHoriz1.setColor(Color.BLACK);
        lineHoriz1.draw();

        Line lineHoriz2 = new Line(10,400,600,400);
        lineHoriz2.setColor(Color.BLACK);
        lineHoriz2.draw();
    }

    private void init(){

        cells = new Cell[cols][rows];
        for (int col = 0; col < cols; col++){
            for(int row = 0; row < rows; row++){
                cells[col][row] = new Cell(col * CELL_SIZE + PADDING, row * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE);

            }
        }

    }

    public boolean isWinner() {


                if (cells[0][0].isPaintedBlue()  && cells[1][0].isPaintedBlue() && cells[2][0].isPaintedBlue()) {
                    return winner;
                }


                if (cells[0][1].isPaintedBlue() && cells[1][1].isPaintedBlue() && cells[2][1].isPaintedBlue()) {
                    return winner = true;
                }


                if (cells[0][2].isPaintedBlue() && cells[1][2].isPaintedBlue() && cells[2][2].isPaintedBlue()) {
                    return winner = true;
                }

                if (cells[0][0].isPaintedBlue() && cells[1][1].isPaintedBlue() && cells[2][2].isPaintedBlue()) {
                return winner = true;
                }

                if (cells[0][2].isPaintedBlue() && cells[1][1].isPaintedBlue() && cells[2][0].isPaintedBlue()) {
                return winner = true;
                }

                if (cells[0][0].isPaintedBlue() && cells[0][1].isPaintedBlue() && cells[0][2].isPaintedBlue()) {
                return winner = true;
                }

                if (cells[1][0].isPaintedBlue() && cells[1][1].isPaintedBlue() && cells[1][2].isPaintedBlue()) {
                return winner = true;
                }

                if (cells[2][0].isPaintedBlue() && cells[2][1].isPaintedBlue() && cells[2][2].isPaintedBlue()) {
                return winner = true;
                }

        return false;

        }

    public int getCols(){
        return cols;
    }

    public int getRows(){
        return rows;
    }

    public Cell getCell(int col, int row) {
        return cells[col][row];
    }
}