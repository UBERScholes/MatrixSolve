package butkevych.matrixsolve.Utils;

import butkevych.matrixsolve.DataStructures.Matrix;
import butkevych.matrixsolve.Exceptions.InputDataSizeException;
import butkevych.matrixsolve.Operations.MatrixOperationList;
import butkevych.matrixsolve.Operations.Operation;

import java.util.ArrayList;

public class ArrayUtils {
    private static ArrayUtils instance;

    public static ArrayUtils getInstance(){
        if(instance==null){
            instance = new ArrayUtils();
        }
        return instance;
    }

    public int getLongestSequence(Matrix in) throws CloneNotSupportedException, InputDataSizeException {
        Matrix transposed = in.clone();
        for(Operation op : MatrixOperationList.getInstance().getOperation_list()){
            transposed = op.execute(transposed);
        }
        int longest_original = this.getLongestSequenceInALine(in);
        int longest_transposed = this.getLongestSequenceInALine(transposed);
        return Math.max(longest_original, longest_transposed);
    }

    private int getLongestSequenceInALine(Matrix in){
        int max = 0;
        int[][] data = in.getData();
        for (int[] datum : data) {
            int row_max = getLongestSequenceInALine(datum);
            if (row_max > max) max = row_max;
        }
        return max;
    }

    private int getLongestSequenceInALine(int[] input){
        int max = 0;
        int temp_max = 0;
        for (int value : input) {
            if (value == 1) temp_max++;
            else {
                if (temp_max > max) max = temp_max;
                temp_max = 0;
            }
        }
        if (temp_max > max) max = temp_max;
        return max;
    }


}
