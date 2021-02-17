/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: none
 * 
 * This file contains code that demonstrates the use of 2d arrays and array
 * lists.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class contains two methods. The first rotates a floor plan and the 
 * other returns the names of mobs that came into contact with an infected mob.
 */
public class minecraft
{
    /**
     * modifies a 2d array containing blocks on the floor by rotating it 90
     * degrees clockwise
     * 
     * @returns the new array
     */
    public static int[][] rotateFloorPlan(int[][] originalFloorPlan)
    {
        //set dimension variables to the height and width of the original plan
        int dimensionA = originalFloorPlan.length;
        int dimensionB = originalFloorPlan[0].length;
        
        //create a new floor plan. Height and width will be swapped
        int[][] newFloorPlan = new int[dimensionB][dimensionA];
        
        for(int row=0; row<dimensionA; row++)
        {
            //loop for each row
            for(int column=0; column<dimensionB; column++)
            {
                //loop for each column
                //rotate every single point on the floor
                newFloorPlan[column][dimensionA-1-row] = 
                originalFloorPlan[row][column];
            }
        }
        
        //return the new plan
        return newFloorPlan;
    }
    
    
    /**
     * Identifies all rows in a 2d array that contain the name of an
     * infected mob
     * 
     * @returns the strings that were in those rows in an array.
     *
    public static ArrayList<String> getMobsToTest(String[][] groups, String infected);
    {
        //the list of mobs to test. Return this list.
        String [] mobsToTest;
        
        for(int row=0; a<groups.length; row++)
        {
            if(groups[row].contains(infected) == true)
            {
                //add every string in the row to mobsToTest
                    
            }
        }
        return mobsToTest;
    }*/
    

    public static void main(String[] args)
    {
        
        
        

    }
}
