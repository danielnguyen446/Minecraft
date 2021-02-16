public class Minecraft
{
    public static int[][] rotateFloorPlan(int[][] originalFloorPlan);
    {
        //set dimension variables to the height and width of the original plan
        int dimensionA = originalFloorPlan.length;
        int dimensionB = originalFloorPlan[0].length;
        
        //create a new floor plan. Height and width will be swapped
        int[][] newFloorPlan = new int[dimensionB][dimensionA];
        
        for(int row=0; row<dimensionA; r++)
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
    
    public static ArrayList<String> getMobsToTest(String[][] groups, String infected);
    {
        //the list of mobs to test. Return this list.
        String [] mobsToTest;
        
        for(each column)
        {
            for(each row)
            {
                if(groups[][] == infected)
                {
                    //add every string in the row to mobsToTest
                    
                }
            }
        }
        return mobsToTest;
    }
	public static void main(String[] args)
	{
		
	}
}
