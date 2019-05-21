package action;

import entity.Matrix;

public class MatrixAverage {

    public static double findArithmeticAverage(Matrix matrix) {
        double sum=0;
        if (matrix != null) {
            for (int i = 0; i < matrix.getNumberRows(); i++) {
                for (int j = 0; j < matrix.getNumberColumns(); j++) {
                    sum+=matrix.getElement(i, j);
                }
            }
            sum/=matrix.getNumberOfElements();
        }
        return sum;
    }

    public static double findGeometricAverage(Matrix matrix) {
        double multi =1;
        if (matrix != null) {
            for (int i = 0; i < matrix.getNumberRows(); i++) {
                for (int j = 0; j < matrix.getNumberColumns(); j++) {
                    multi*=matrix.getElement(i, j);
                }
            }
            multi = Math.pow(multi, 1.0/matrix.getNumberOfElements());
        }
        return multi;
    }


}
