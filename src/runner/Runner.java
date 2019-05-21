package runner;

import action.MatrixAverage;
import action.MatrixExtremes;
import action.MatrixLocalExtremes;
import action.MatrixTransposition;
import entity.Matrix;
import generator.MatrixGenerator;

public class Runner {

    private static void printLocation(int [] arr) {
        System.out.print("["+arr[0] + "; " + arr[1]+"].");
    }

    public static void main(String[] args) {
            Matrix myMatrix = new Matrix();
            MatrixGenerator.fill(myMatrix);
            System.out.println(myMatrix.turnMatrixToStrings());
            System.out.println("Minimal elemet is " + MatrixExtremes.findMinimalElement(myMatrix));
            System.out.println("Maximal element is  " + MatrixExtremes.findMaximalElement(myMatrix));
            System.out.println("Arithmetic average is " + MatrixAverage.findArithmeticAverage(myMatrix));
            System.out.println("Geometric average is " + MatrixAverage.findGeometricAverage(myMatrix));
            System.out.println("Local minimum position is ");
            int [] location = MatrixLocalExtremes.findLocalMinimum(myMatrix);
            printLocation(location);
            System.out.println("\nLocal maximum position is ");
            location = MatrixLocalExtremes.findLocalMaximum(myMatrix);
            printLocation(location);
            System.out.println("\nTranspose matrix is ");
            myMatrix=MatrixTransposition.transpose(myMatrix);
            System.out.println(myMatrix.turnMatrixToStrings());
    }
}
