package OperationsTests;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Operations.MatrixTranspose;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransposeTest implements MatrixOperationsTest{

    @Override
    @Test
    public void test_execute() throws InputDataSizeException {
        Matrix input = new Matrix(2,3);
        input.fill_Matrix(new int[][]{{1,0},{0,1},{1,0}});
        Matrix result = new Matrix(3,2);
        result.fill_Matrix(new int[][]{{1,0,1},{0,1,0}});
        assertArrayEquals(result.getData(), new MatrixTranspose().execute(input).getData());
    }
}