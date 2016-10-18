/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialanalysis;

import factorialanalysis.statistics.*;



/**
 *
 * @author Emmanuel
 */
public class FactorialAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\Emmanuel\\Documents\\Maestria\\CSVSamples\\covsample.csv";
        CvsReader reader = new CvsReader(path);
        int[] colIndex = {0,1};
        double[][] data = reader.getDataAt(colIndex);
        
        
        Covariance cov = new Covariance(Matrix.getAllColumnAt(data,0),Matrix.getAllColumnAt(data,1));
        cov.calCovariance();
        System.out.println(cov.getCovariance());
        
    }
    
    
}
