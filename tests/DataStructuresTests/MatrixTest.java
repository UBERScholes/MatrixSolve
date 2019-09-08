package DataStructuresTests;

import DataStructures.Matrix;
import Exceptions.InputDataSizeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MatrixTest{

    @Test
    void test_fillMatrix() throws InputDataSizeException {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        Matrix test = new Matrix(3,3);
        test.fill_Matrix(new int[]{1,2,3,4,5,6,7,8,9});
        assertArrayEquals(matrix, test.getData());
        assertThrows(InputDataSizeException.class, ()->{test.fill_Matrix(new int[]{1,2,3,4});});
        assertThrows(InputDataSizeException.class, ()->{test.fill_Matrix(new int[]{1,2,3,4,2,3,4,2,3,4,2,3,4,2,3,4});});
    }
   // @Test(expected = InputDataSizeException.class)
  //  public void test_fillMatrixWrongInput(){
  //      new Matrix(2,3, new int[]{1,2,3,4,5,6,7,8,9});
   // }
}