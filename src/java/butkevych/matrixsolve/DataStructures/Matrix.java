package butkevych.matrixsolve.DataStructures;

import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Utils.MatrixUtils;

public class Matrix implements Cloneable{
    private int[][] data;
    private int width;
    private int height;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.data = new int[height][width];
    }

    public void fill_Matrix(int[] input) throws InputDataSizeException, IllegalArgumentException {
            MatrixUtils.getInstance().checkInputSize(width, height, input);
            int count = 0;
            for (int i = 0; i < this.height; i++)
                for (int j = 0; j < this.width; j++) {
                    MatrixUtils.getInstance().checkIsBinaryNum(input[count]);
                    this.data[i][j] = input[count];
                    count++;
                }
        }

    public void fill_Matrix(int[][] input) throws InputDataSizeException, IllegalArgumentException {
        MatrixUtils.getInstance().checkInputSize(width, height, input);
        for (int i = 0; i < this.height; i++)
            for (int j = 0; j < this.width; j++) {
                MatrixUtils.getInstance().checkIsBinaryNum(input[i][j]);
                this.data[i][j] = input[i][j];
            }
    }


    public int[][] getData(){
        return this.data.clone();
    }


    public Matrix clone() throws CloneNotSupportedException {
        return (Matrix)super.clone();
    }
}
