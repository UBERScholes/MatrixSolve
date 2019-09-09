package butkevych.matrixsolve.Exceptions;

public class InputDataSizeException extends Exception{
    public InputDataSizeException(int matrix_size, int input_length){
        super("\nMatrix length: "+matrix_size+
                "\nInputData length: "+input_length);
    }
    public InputDataSizeException(int matrix_width, int matrix_height, int input_width, int input_height){
        super("\nMatrix size: "+matrix_width+"x"+matrix_height+
                "\nInputData size: "+input_width+"x"+input_height);
    }
}
