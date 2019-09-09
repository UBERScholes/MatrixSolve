package butkevych.matrixsolve.Utils;

import butkevych.matrixsolve.Exceptions.InputDataSizeException;

public class MatrixUtils {
    private static MatrixUtils instance;

    public static MatrixUtils getInstance(){
        if(instance==null){
            instance = new MatrixUtils();
        }
        return instance;
    }

    public void checkIsBinaryNum(int num){
        if(num!=0&&num!=1){
            throw new IllegalArgumentException("Only 1's and 0's are allowed for input");
        }
    }

    public void checkInputSize(int width, int height, int[] input) throws InputDataSizeException {
        int matrix_size = width*height;
        if (matrix_size != input.length) {
            throw new InputDataSizeException(matrix_size, input.length);
        }
    }
    public void checkInputSize(int width, int height, int[][] input) throws InputDataSizeException {
        int input_width = input[0].length;
        int input_height = input.length;
        if ((width != input_width)||(height != input_height)) {
            throw new InputDataSizeException(width, height, input_width, input_height);
        }
    }
}
