package action;

import entity.Matrix;

public class MatrixExtremes {

    public static double findMinimalElement(Matrix matrix) {
        double minElement = -1;
        if (matrix != null) {
            minElement = matrix.getElement(0, 0);
            for (int i = 0; i < matrix.getNumberRows(); i++) {
                for (int j = 0; j < matrix.getNumberColumns(); j++) {
                    if (matrix.getElement(i, j)< minElement) {
                        minElement = matrix.getElement(i, j);
                    }
                }
            }
        }
        return minElement;
    }

    public static double findMaximalElement(Matrix matrix) {
        double maxElement = -1;
        if (matrix != null) {
            maxElement=matrix.getElement(0,0);
            for (int i = 0; i < matrix.getNumberRows(); i++) {
                for (int j = 0; j < matrix.getNumberColumns(); j++) {
                    if (matrix.getElement(i, j) > maxElement) {
                        maxElement = matrix.getElement(i, j);
                    }
                }
            }
        }
        return maxElement;
    }
}
