/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialanalysis.statistics;

/**
 *
 * @author Emmanuel
 */
public abstract class Matrix {
    
    protected double[][] data;
    protected double[][] matrix;
    
    public Matrix(double[][] data){
        this.data = data;
    }
    
    public abstract void calMatrix();
    
    public double[][] getMatrix(){
        return this.matrix;
    }
    
    public static double[] getAllColumnAt(double[][] matrix, int colIndex){
        
        double[] result = new double[matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            result[i] = matrix[i][colIndex];
        }
        return result;
    }
    
    public static void mirrorRightValues(double[][] matrix){
        for(int col=0;col<matrix[0].length;col++){
            for(int row=col;row<matrix.length;row++){        
                if(row==col)
                    continue;
                else{
                    matrix[col][row] = matrix[row][col]; 
                }
            }
        }
    }
}
