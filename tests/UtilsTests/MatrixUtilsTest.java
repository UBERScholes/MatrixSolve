package UtilsTests;

import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Utils.MatrixUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    void checkInputSize(){
        int width = 2;
        int height = 3;
        int[] right_input = new int[]{0,1,0,1,1,1};
        int[] wrong_input = new int[]{0,1,0,1,1,1,0};
      int[] wrong_input_2 = new int[]{0,1,0,1,1};
        assertDoesNotThrow(()->MatrixUtils.getInstance().checkInputSize(width, height, right_input));
        assertThrows(InputDataSizeException.class, ()->MatrixUtils.getInstance().checkInputSize(width, height, wrong_input));
        assertThrows(InputDataSizeException.class, ()->MatrixUtils.getInstance().checkInputSize(width, height, wrong_input_2));
    }

    @Test
    void testCheckInputSize(){
        int width = 2;
        int height = 3;
        int[][] right_input = new int[][]{{1,1},{0,0},{1,1}};
        int[][] wrong_input = new int[][]{{1,1,1},{0,0,0}};
        assertDoesNotThrow(()->MatrixUtils.getInstance().checkInputSize(width, height, right_input));
        assertThrows(InputDataSizeException.class, ()->MatrixUtils.getInstance().checkInputSize(width, height, wrong_input));
    }
}