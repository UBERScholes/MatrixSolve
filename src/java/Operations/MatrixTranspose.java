package Operations;

import DataStructures.Matrix;
import Exceptions.InputDataSizeException;

public class MatrixTranspose implements MatrixOperations{
    @Override
    public Matrix execute(Matrix in) throws InputDataSizeException {
        int[][] data = in.getData();
        int width = data[0].length;
        int height = data.length;
        int new_width = height;
        int new_height = width;
        Matrix result = new Matrix(new_width, new_height);
        int[][] new_data = new int[new_height][new_width];
        for(int i = 0; i<new_height; i++)
            for(int j = 0; j<new_width; j++){
                new_data[i][j]=data[j][i];
            }
        result.fill_Matrix(new_data);
            return result;
    }
}
