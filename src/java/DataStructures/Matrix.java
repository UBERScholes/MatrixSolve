package DataStructures;

import Exceptions.InputDataSizeException;

public class Matrix {
    private int[][] data;
    private int width;
    private int height;

    public Matrix(int width, int height) {
        this.width = width;
        this.height = height;
        this.data = new int[width][height];
    }

    public void fill_Matrix(int[] input) throws InputDataSizeException {
            if (this.data.length*this.data[0].length != input.length) {
                throw new InputDataSizeException(this.data.length*this.data[0].length, input.length);
            }
            int count = 0;
            for (int i = 0; i < this.height; i++)
                for (int j = 0; j < this.width; j++) {
                    this.data[i][j] = input[count];
                    count++;
                }
        }


    public int[][] getData(){
        return this.data.clone();
    }
}
