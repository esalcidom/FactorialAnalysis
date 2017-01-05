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
    private double[][] subMatrix;
    int start, last;
    private int matrixSize;
    
    public Determinant(MCorrelation matrix){
        this.matrix = matrix.getMatrix();
        this.matrixSize = this.matrix.length;
    }
    
    public Determinant(double[][] matrix){
        this.matrix = matrix;
        this.matrixSize = this.matrix.length;
    }
    
    public void calDeterminant(){
        //Dodgson condensation
        this.determinant = dodgsonDeterminant(this.matrix, matrixSize);
    }
    
    public double dodgsonDeterminant(double[][] matrix, int size){
        double det;
        if(size == 1){
            det = matrix[0][0];
        }
        else if(size == 2){
            det = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }
        else{
            det = 0;
            for(int i=0;i<size;i++){
                subMatrix = generateSubMatrix(matrix, size, i);
                det += Math.pow(-1.0, 1.0+i+1.0) * matrix[0][i] * dodgsonDeterminant(subMatrix, size-1);
            }
        }
        return det;
    }
    
    private double[][] generateSubMatrix(double matrix[][], int size, int i){
        subMatrix = new double[size-1][];
        for(int k=0;k<(size-1);k++){
            subMatrix[k] = new double[size-1];
        }
        for(int z=1;z<size;z++){
            int p=0;
            for(int j=0;j<size;j++){
                if(j == i){
                    continue;
                }
                subMatrix[z-1][p] = matrix[z][j];
                p++;
            }
        }
        return subMatrix;
    }
    
    public double getDeterminant(){
        return this.determinant;
    }
}
