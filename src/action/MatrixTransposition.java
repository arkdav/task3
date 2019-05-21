package action;

import entity.Matrix;

public class MatrixTransposition {

    public static Matrix transpose(Matrix matrix) {
        if (matrix.getNumberColumns() == matrix.getNumberRows()) {
            for (int i = 0; i < matrix.getNumberRows(); i++) {
                for (int j = i; j < matrix.getNumberColumns(); j++) {
                    double temp = matrix.getElement(i, j);
                    matrix.setElement(i, j, matrix.getElement(j, i));
                    matrix.setElement(j, i, temp);
                }
            }
            return matrix;
        }
        else {
            Matrix transposeMatrix = new Matrix(matrix.getNumberColumns(), matrix.getNumberRows());
            for (int i = 0; i < matrix.getNumberRows(); i++){
                for (int j = 0; j < matrix.getNumberColumns(); j++){
                    double temp = matrix.getElement(i, j);
                    transposeMatrix.setElement(j,i,temp);
                }
            }
            return transposeMatrix;
        }
    }
}
