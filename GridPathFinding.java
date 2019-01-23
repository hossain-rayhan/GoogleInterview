//Amazon Interview Question-2
//Find wheather there is a path from the start grid to a specific grid
//The grid is a 2D matrix; 1 means path, 0 means obstacle
//The start node is (0, 0); target grid value = 9

public class GridPathFinding{
	public static void main(String[] args){
		int[][] grid =  {
			 { 1, 0, 1, 1, 0 },
   			 { 1, 1, 1, 0, 1 },
   			 { 0, 1, 1, 0, 0 },
   			 { 9, 1, 1, 1, 0 },
   			 { 0, 1, 0, 0, 0 },
   			 { 0, 1, 1, 0, 0 },
   			 { 0, 1, 1, 1, 0 }, };
		System.out.println("Is Path: " + isPath(0, 0, 7, 5, grid));
	}

	//start at (r, c)
	public static boolean isPath(int r, int c, int row, int column, int[][] grid){
		//if out of matrix bound return false
		if(r < 0 || c < 0 || r >= row || c >= column)
			return false;
		//if an obstacle or wall return false
		if(grid[r][c] == 0)
			return false;
		//if the target(=9) return true
		if(grid[r][c] == 9)
			return true;

		//Otherwise, its an explorable path. Change the value to 0 so that we do not visit it again
		//Then explore 4 neighbors of the grid
		grid[r][c] = 0;
		return isPath(r-1, c, row, column, grid)
			|| isPath(r+1, c, row, column, grid)
			|| isPath(r, c-1, row, column, grid)
			|| isPath(r, c+1, row, column, grid);
	}
}
