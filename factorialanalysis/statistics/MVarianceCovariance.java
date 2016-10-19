/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialanalysis.statistics;
import factorialanalysis.*;

/**
 *
 * @author Emmanuel
 */
public class MVarianceCovariance extends Matrix{
    
    public MVarianceCovariance(double[][] data){
        super(data);
    }
    
    @Override
    public void calMatrix(){
        for(int col=0;col<data[0].length;col++){
            for(int row=col;row<data.length;row++){
                if(row==col){
                    double[] columnValues = Matrix.getAllColumnAt(data, col);
                    Variance variance = new Variance(columnValues);
                    matrix[row][col] = variance.getVariance();
                }
                else{
                    double[] variableX = Matrix.getAllColumnAt(data, row);
                    double[] variableY = Matrix.getAllColumnAt(data, col);
                    Covariance covariance = new Covariance(variableX,variableY);
                    covariance.calCovariance();
                    matrix[row][col] = covariance.getCovariance();
                }
            }
        }
    }
}
