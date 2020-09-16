package exceptions;

import java.util.List;

public class SimpleMaths {

    /** calculate the average value of a list of integers
     * 
     * @param listOfIntegers a list containing integer numbers
     * @return the average of the list
     */
    public static int calculateAverage(List<Integer> listOfIntegers) {
        int average=0;
		
		
        for (int value: listOfIntegers) {
            average+=value;
        }
        average/=listOfIntegers.size();
        return average;     
		
    }   

}