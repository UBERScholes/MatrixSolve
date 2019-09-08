package DataStructuresTests;

import DataStructures.Matrix;
import Exceptions.InputDataSizeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MatrixTest{

    @Test
    void test_fillMatrix() throws InputDataSizeException, IllegalArgumentException {
        int[][] matrix = new int[][]{{1,1,1},{0,0,0},{1,1,1}};
        Matrix test = new Matrix(3,3);
        test.fill_Matrix(new int[]{1,1,1,0,0,0,1,1,1});
        assertArrayEquals(matrix, test.getData());
        assertThrows(InputDataSizeException.class, ()->{test.fill_Matrix(new int[]{1,1,1,1});});
        assertThrows(InputDataSizeException.class, ()->{test.fill_Matrix(new int[]{1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0});});
        assertThrows(IllegalArgumentException.class, ()->{test.fill_Matrix(new int[]{1,0,-1,4,1,0,0,0,0});});
    }
   // @Test(expected = InputDataSizeException.class)
  //  public void test_fillMatrixWrongInput(){
  //      new Matrix(2,3, new int[]{1,2,3,4,5,6,7,8,9});
   // }
}