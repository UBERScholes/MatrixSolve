package DataStructuresTests;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MatrixTest{

    @Test
    void test_fillMatrix() throws InputDataSizeException, IllegalArgumentException {
        int[][] matrix = new int[][]{{1,1,1},{0,0,0},{1,1,1}};
        Matrix test = new Matrix(3,3);
        test.fill_Matrix(new int[]{1,1,1,0,0,0,1,1,1});
        assertArrayEquals(matrix, test.getData());
        assertThrows(InputDataSizeException.class, ()->test.fill_Matrix(new int[]{1,1,1,1}));
        assertThrows(InputDataSizeException.class, ()->test.fill_Matrix(new int[]{1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0}));
        assertThrows(IllegalArgumentException.class, ()->test.fill_Matrix(new int[]{1,0,-1,4,1,0,0,0,0}));
    }

}