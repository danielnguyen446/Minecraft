/**
 * Name: Daniel Nguyen
 * ID: A16129027
 * Email: d7nguyen@ucsd.edu
 * Sources used: https://learn.zybooks.com/zybook/UCSDCSE11CaoWinter2021/chapter/9/section/1
 * 
 * This file contains code that demonstrates the use of 2d arrays and array
 * lists. Arrays and lists will be created and modified based on a given array.
 */

import java.util.ArrayList;
import java.lang.*; 
import java.util.*; 
/**
 * This class contains two methods. The first takes a floor plan
 * and rotates it 90 degrees clockwise and the second method returns the names
 * of mobs that came into contact with a mob infected with covid.
 */
public class Minecraft
{

    /**
     * modifies a 2d array containing blocks on the floor by rotating it 90
     * degrees clockwise.
     * 
     * @param originalFloorPlan(a 2d array containing floor block types)
     * @return newFloorPlan (the new rotated array).
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
     * @param groups(2d array of groups that were formed during party)
     * @param infected(name of infected mob)
     * @return mobsToTest (the strings that were in those rows in an array).
     */
    public static ArrayList<String> getMobsToTest(String[][] groups, String infected)
    {
        //make an array list of mobs that came into contact with the infected.
        ArrayList<String> mobsContacted = new ArrayList<String>();
        
        //iterate through the 2d array's rows
        for(int row=0; row<groups.length; row++)
        {
            //if the row contains the infected mob
            if(Arrays.toString(groups[row]).indexOf(infected) >= 0){
                for(int i = 0; i < groups[row].length; i++)
                {
                    //add every string in the row to mobsContacted
                    mobsContacted.add(groups[row][i]);
                }
            }
        }
        
        /*get rid of duplicates.*/
        
        //create this final Array list to return called mobsToTest
        ArrayList<String> mobsToTest = new ArrayList<String>();
        
        //examine each string on the list mobsContacted
        for(int a=0;a<mobsContacted.size();a++)
        {
            //if mobsToTest does not contain the mob yet, add it to mobsToTest.
            if(!mobsToTest.contains(mobsContacted.get(a)))
            {
                mobsToTest.add(mobsContacted.get(a));
            }
        }
        
        //return the array list
        return mobsToTest;
    }
    
    /**
     * No main method required in this PA.
     */
    public static void main(String[] args)
    {
    
    }
}  








