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
public class Covariance {
    
    private double[] variableX;
    private double[] variableY;
    private double covariance;
    
    public Covariance(double[] x, double[]y){
        this.variableX = x;
        this.variableY = y;
    }
    
    public void calCovariance(){
        Mean meanX = new Mean(variableX);
        Mean meanY = new Mean(variableY);
        meanX.calMean();
        meanY.calMean();
        double sumX = 0.0;
        double sumY = 0.0;
        for(int index=0;index<variableX.length;index++){
            sumX += (variableX[index] - meanX.getMean());
            sumY += (variableY[index] - meanY.getMean());
        }
        covariance =  (1/variableX.length) * sumX * sumY;
    }
    
    
    public double getCovariance(){
        return this.covariance;
    }
    
}
