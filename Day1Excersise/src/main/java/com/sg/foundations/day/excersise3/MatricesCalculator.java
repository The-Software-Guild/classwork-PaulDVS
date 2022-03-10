package com.sg.foundations.day.excersise3;
/**
 *
 * @author Paul van Sittert
 */
public class MatricesCalculator {
    private int matrix1[][] = new int[3][3];
    private int matrix2[][] = new int[3][3];

    public MatricesCalculator() {
        this.matrix1 = new int[][]{{2,4,6},{8,10,12},{14,16,18}};
        this.matrix2 = new int[][]{{3,6,9},{12,15,18},{21,24,27}};
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }
    
    public int[][] getSum() {
        int matrixSum[][] = new int[3][3];
        
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                matrixSum[i][j] = this.matrix1[i][j] + this.matrix2[i][j];
            }
        }
        
        return matrixSum;
    }
    
}
