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
public class Mean {
    private double[] data;
    private double[][] matrixData;
    private double mean;
    
    public Mean(double[] data){
        this.data = data;
    }
    
    public Mean(double[][] data){
        this.matrixData = data;
    }
    
    public Mean(){}
    
    public void setData(double[] data){
        this.data =data;
    }
    
    public void calMean(){
        double result = 0;
        for(double d : data){
            result += d;
        }        
        mean = result / data.length;
    }
    
    public double getMean(){
        return mean;
    }
    
    public void calMeanVector(){
        
    }
}
