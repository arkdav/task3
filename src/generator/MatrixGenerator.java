package generator;

import entity.Matrix;

import java.util.Random;

public class MatrixGenerator {

    private static final int HIGHEST_VALUE = 100;

    public static void fill(Matrix matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.getNumberRows(); i++) {
            for (int j = 0; j < matrix.getNumberColumns(); j++) {
                double element=random.nextDouble()*HIGHEST_VALUE;
                matrix.setElement(i, j, element);
            }
        }
    }
}
