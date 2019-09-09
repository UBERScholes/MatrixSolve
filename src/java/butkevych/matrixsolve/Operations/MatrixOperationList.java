package butkevych.matrixsolve.Operations;

import java.util.ArrayList;

public class MatrixOperationList {
    private static MatrixOperationList instance;
    private ArrayList<Operation> operation_list;

    public static MatrixOperationList getInstance(){
        if(instance==null){
            instance = new MatrixOperationList();
        }
        return instance;
    }
    private MatrixOperationList(){
        this.operation_list = new ArrayList<>();
        this.operation_list.add(new MatrixTranspose());
    }

    public ArrayList<Operation> getOperation_list() {
        return this.operation_list;
    }
}
