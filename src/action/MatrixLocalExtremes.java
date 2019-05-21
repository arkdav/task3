package action;

import entity.Matrix;

public class MatrixLocalExtremes {

    public static int[] findLocalMinimum(Matrix matrix) {
        int[] minPosition = {-1, -1};
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColumns(); j++) {
                if (isLocalMinimum(matrix, i, j)) {
                    minPosition[0] = i;
                    minPosition[1] = j;
                    return minPosition;
                }
            }
        }
        return minPosition;
    }

    private static boolean isLocalMinimum(Matrix matrix, int i, int j) {
        double min = matrix.getElement(i, j);
        for (int ii = getUpperRow(i); ii <= getLowerRow(matrix, j); ii++) {
            for (int jj = getLeftColumn(j); jj <= getRightColumn(matrix, j); jj++) {
                if (matrix.getElement(ii, jj) < min) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] findLocalMaximum(Matrix matrix) {
        int[] maxPosition = {-1, -1};
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColumns(); j++) {
                if (isLocalMaximum(matrix, i, j)) {
                    maxPosition[0] = i;
                    maxPosition[1] = j;
                    return maxPosition;
                }
            }
        }
        return maxPosition;
    }

    private static boolean isLocalMaximum(Matrix matrix, int i, int j) {
        double max = matrix.getElement(i, j);
        for (int ii = getUpperRow(i); ii <= getLowerRow(matrix, i); ii++) {
            for (int jj = getLeftColumn(j); jj <= getRightColumn(matrix, j); jj++) {
                if (matrix.getElement(ii, jj) > max) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int getUpperRow(int i){
        return ((i - 1) >= 0) ? (i - 1) : 0;
    }

    public static int getLowerRow(Matrix matrix, int i){
        return ((i + 1) < (matrix.getNumberRows() - 1)) ? (i + 1) : matrix.getNumberRows() - 1;
    }

    public static int getLeftColumn( int j) {
        return ((j - 1) >= 0) ? (j - 1) : 0;
    }

    public static int getRightColumn(Matrix matrix, int j) {
        return ((j + 1) < matrix.getNumberColumns() - 1) ? (j + 1) : matrix.getNumberColumns() - 1;
    }

}
