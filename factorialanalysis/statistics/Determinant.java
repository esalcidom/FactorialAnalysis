/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialanalysis.statistics;

import java.util.*;

/**
 *
 * @author Emmanuel
 */
public class Determinant {
    
    private double determinant;
    private double[][] matrix;
    private int matrixSize;
    
    public Determinant(MCorrelation matrix){
        this.matrix = matrix.getMatrix();
        this.matrixSize = this.matrix.length;
    }
    
    public Determinant(double[][] matrix){
        this.matrix = matrix;
    }
    
    public void calDeterminant(){
        //Gauss elimination
        for(int col=0;col<matrixSize;col++){
            
        }
        
    }
    
    private double gaussianEliminationPivot(int rowColPivot){
        double divisionValue = this.matrix[rowColPivot][rowColPivot];
        if(divisionValue>1){
            this.matrix[rowColPivot][rowColPivot] = 1;
        }
        
        for(int row=rowColPivot+1;row<matrixSize;row++){
            double rowElement = this.matrix[row][rowColPivot] * -1;
            for(int colAlter=rowColPivot;colAlter<matrixSize;colAlter++){
                double elementPivotRow = this.matrix[rowColPivot][colAlter];
                double elementSwitchRow = this.matrix[row][colAlter];
                double valueSwitch = rowElement * elementPivotRow + elementSwitchRow;
                this.matrix[row][colAlter] = valueSwitch;
            }
        }
        return divisionValue;
    }
    
    public double getDeterminant(){
        return this.determinant;
    }
}
