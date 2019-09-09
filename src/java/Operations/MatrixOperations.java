package Operations;

import DataStructures.Matrix;
import Exceptions.InputDataSizeException;

public interface MatrixOperations {
    Matrix execute(Matrix in) throws InputDataSizeException;
}
