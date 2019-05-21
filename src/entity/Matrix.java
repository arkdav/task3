package entity;

public class Matrix
{
    private static final int MATRIX_ROWS = 4;
    private static final int MATRIX_COLUMNS = 5;
    private double [][]matrix;

    public Matrix() {
        matrix = new double[MATRIX_ROWS][MATRIX_COLUMNS];
    }

    public Matrix(int rows, int columns) {
        matrix = new double[rows][columns];
    }

    public void setElement(int row, int column, double value){
        matrix[row][column] = value;
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public int getNumberRows() {
        return matrix.length;
    }

    public int getNumberColumns() {
        return matrix[0].length;
    }

    public int getNumberOfElements(){
        return getNumberRows()*getNumberColumns();
    }

    public String turnMatrixToStrings() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                strBuilder.append(matrix[i][j]).append(" ");
            }
            strBuilder.append("\n");
        }
        return strBuilder.toString();
    }
}
