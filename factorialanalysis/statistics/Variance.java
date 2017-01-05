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
public class Variance {
    private double[] data;
    private double variance;
    
    
    public Variance(double[] data){
        this.data = data;
        
    }
    
    public void calVariance(){        
        double mean = new Mean(data).getMean();
        double result = 0;
        for(double d : data){
            result += (d-mean)*(d-mean);
        }
        variance = result / data.length;
    }
    
    public double getVariance(){
        return this.variance;
    }
    
    public double[][] getVarianceCovarianceMatrix(double[][] matrixValues){
        return matrixValues;
    }
    
}
