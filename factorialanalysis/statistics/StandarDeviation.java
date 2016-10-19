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
public class StandarDeviation {
    
    private double[] data;
    private double standarDeviation;
    
    public StandarDeviation(double[] data){
        this.data = data;
    }
    
    public void calStandarDeviation(){
        Variance var = new Variance(data);
        var.calVariance();
        this.standarDeviation = Math.sqrt(var.getVariance());
    }
    
    public double getStandarDeviation(){
        return this.standarDeviation;
    }
}
