package labor6_2;

public class Matrix {

    private double[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Matrix(double[][] data) {
        this.data = data;
    }
}
