/*
 * Este analisis es de consistencia, este valor puede arrojar de 0 a 1 marcado como porcentaje de fiabilidad de los items de los que consta una variable
 * En este momento se tiene el coeficiente mediante la varianza de los items.
 */
package factorialanalysis.statistics;

/**
 *
 * @author Emmanuel
 */
public class ACronbach {
    
    private double alpha;
    private double[][] data;
    private double[] itemsTotal;
    private double[] itemsVariance;
    
    public ACronbach(double[][] data){
        this.data = data;
        //itemsVariance = new double[];
        getItemsTotal();
        calVariance();
    }
    
    public double getAlpha(){
        return alpha;
    }
    
    private void getItemsTotal(){
        itemsTotal = new double[data.length];
        for(int i=0;i<data.length;i++){
            double total=0;
            for(int j=0;j<data[i].length;j++){
                total += data[i][j];
            }
            itemsTotal[i] = total;
        }
    }
    
    public void calVariance(){
        double k,s=0;
        itemsVariance = new double[data[0].length+1];
        for(int j=0;j<data[0].length;j++){
            double[] itemColumn = new double[data.length];
            for(int i=0;i<data.length;i++){
                itemColumn[i] = data[i][j];
            }
            itemsVariance[j] = new Variance(itemColumn).getVariance();
        }
        itemsVariance[itemsVariance.length-1] = new Variance(itemsTotal).getVariance();
        k = (double)(data[0].length /(data[0].length-1.0));
        for(int z=0;z<itemsVariance.length-1;z++){
            s += itemsVariance[z];
        }
        s /= itemsVariance[itemsVariance.length-1];
        alpha = k*(1-s);
    }
    
    private void matrixVariance(){
        //variance through correlation matrix
    }
}


