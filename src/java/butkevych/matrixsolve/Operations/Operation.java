package butkevych.matrixsolve.Operations;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;

public interface Operation {
    Matrix execute(Matrix in) throws InputDataSizeException;
}
