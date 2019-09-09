package UtilsTests;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Utils.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void getLongestSequence() throws InputDataSizeException, CloneNotSupportedException {
        int[][] test_data1 = new int[][]{{1,0,0,0,1,1,1,0,0},{0,0,1,0,1,1,0,1,1},{1,1,1,1,1,1,0,1,1}};
        Matrix test_matrix1 = new Matrix(9,3);
        test_matrix1.fill_Matrix(test_data1);
        assertEquals(6, ArrayUtils.getInstance().getLongestSequence(test_matrix1));

        int[][] test_data2 = new int[][]{{0,0,0,1,0,0},{1,0,1,1,0,1},{0,0,0,1,0,0}};
        Matrix test_matrix2 = new Matrix(6,3);
        test_matrix2.fill_Matrix(test_data2);
        assertEquals(3, ArrayUtils.getInstance().getLongestSequence(test_matrix2));

    }
}