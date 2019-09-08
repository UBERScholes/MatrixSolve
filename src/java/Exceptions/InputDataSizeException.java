package Exceptions;

public class InputDataSizeException extends Exception{
    public InputDataSizeException(int matrix_size, int input_length){
        super("Matrix length: "+matrix_size+"\n"+
                "InputData length: "+input_length);
    }
}
