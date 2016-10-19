/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialanalysis.statistics;

import java.util.*;

/**
 *
 * @author Emmanuel
 */
public class Expected {
    
    private double[] data;
    private HashMap<Double,Double> dataSorted;
    private double expectedValue;
    private double dataSize;
    
    public Expected(double[] data){
        this.data = data;
        dataSize = data.length;
        dataSorted = new HashMap<Double,Double>();
    }
    
    public void calExpected(){
        double result=0;
        setDataSorted();
        Iterator sortedIterator = dataSorted.entrySet().iterator();
        while(sortedIterator.hasNext()){
            Map.Entry pair = (Map.Entry)sortedIterator.next();
            result += (Double)pair.getKey() * ((Double)pair.getValue() / dataSize);
        }
        expectedValue = result;
    }
    
    private void setDataSorted(){
        Arrays.sort(data);
        double elementToCompare=data[0];
        double numberOfElements=1;
        for(int i=1;i<data.length;i++){
            if(elementToCompare == data[i]){
                numberOfElements++;
                continue;
            }
            else{
                dataSorted.put(elementToCompare, numberOfElements);
                elementToCompare = data[i];
                numberOfElements=1;
            }
        }
        dataSorted.put(elementToCompare, numberOfElements);
    }
    
    public double[] getData(){
        return this.data;
    }
    
    public double getExpected(){
        return this.expectedValue;
    }
}
