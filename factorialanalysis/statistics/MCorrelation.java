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
public class MCorrelation extends Matrix{

    public MCorrelation(double[][] data) {
        super(data);
    }

    @Override
    public void calMatrix() {
        for(int col=0;col<data[0].length;col++){
            for(int row=col;row<data.length;row++){
                if(row==col){
                    this.matrix[row][col] = 1;
                }
                else{
                    double[] variableX = Matrix.getAllColumnAt(data, row);
                    double[] variableY = Matrix.getAllColumnAt(data, col);
                    Correlation correlationXY = new Correlation(variableX,variableY);
                    correlationXY.calCorrelation();
                    this.matrix[row][col] = correlationXY.getCorrelation();
                }
            }
        }
    }
    
    
}
