package butkevych.matrixsolve.Main.ConsoleApplication;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Operations.MatrixOperationList;
import butkevych.matrixsolve.Operations.MatrixTranspose;
import butkevych.matrixsolve.Operations.Operation;
import butkevych.matrixsolve.Utils.ArrayUtils;
import butkevych.matrixsolve.Utils.MatrixUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IllegalFormatException;

public class ConsoleLauncher {
    public static void main(String[] args) throws CloneNotSupportedException, InputDataSizeException {
        int width = enter_size(true);
        int height = enter_size(false);
        int[][] input = enter_data(width, height);

        Matrix matrix = new Matrix(width, height);
        try {
            matrix.fill_Matrix(input);
        } catch (InputDataSizeException e) {
            e.printStackTrace();
        }


        System.out.println("\n\nThe longest sequence: " +ArrayUtils.getInstance().getLongestSequence(matrix));
    }

    /**
     * @param flag true == "width" false == "height"
     * @return Entered width or height by user via Console
     */
    private static int enter_size(boolean flag){
        String type;
        if(flag) type="width"; else type = "height";
        int size;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter matrix "+type+": ");
            try {
                size = Integer.parseInt(reader.readLine());
                if (size<=0){
                    throw new IllegalArgumentException();
                }
                break;
            } catch (Exception e) {
                System.out.println("The "+type+" must be positive and higher than 0");
            }
        }
        return size;
    }

    private static int[][] enter_data(int width, int height){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[][] input = new int[height][width];
        for(int i = 0; i<height; i++)
            for(int j = 0; j<width; j++){
                input[i][j]=-1;
                while (true) {
                    System.out.println("Enter value on position [ "+(i+1)+" ] [ "+(j+1)+" ]: ");
                    try {
                        input[i][j] = Integer.parseInt(reader.readLine());
                        if (input[i][j] != 0 && input[i][j]!=1){
                            throw new IllegalArgumentException();
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Only 1's and 0's are allowed to be entered.");
                    }
                }
            }
        return input;
    }
}
