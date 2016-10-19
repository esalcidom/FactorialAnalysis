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
public class Correlation {
    
    private double[] varX,varY;
    private double correlation;
    
    public Correlation(double[] varX, double[] varY){
        this.varX = varX;
        this.varY = varY;
    }
    
    public void calCorrelation(){
        Covariance cov = new Covariance(varX, varY);
        cov.calCovariance();
        StandarDeviation standarX = new StandarDeviation(varX);
        standarX.calStandarDeviation();
        StandarDeviation standarY = new StandarDeviation(varY);
        standarY.calStandarDeviation();
        this.correlation = (cov.getCovariance() / (standarX.getStandarDeviation())*(standarY.getStandarDeviation()));
    }
    
    
    public double getCorrelation(){
        return this.correlation;
    }
}
