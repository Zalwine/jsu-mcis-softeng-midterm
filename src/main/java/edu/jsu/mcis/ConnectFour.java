package edu.jsu.mcis;

public class ConnectFour {
    public enum Location {EMPTY, RED, BLACK};
	public int[][] board = new int[6][7];
	
    public ConnectFour() {
		for(int i = 0; i < 7; i++){
			for(int k = 0; k < 7; k++){
				board[i][k] = Location.EMPTY;
			}
		}
    }
    
    public Location getTopOfColumn(int column) {
		
    }
    
    public int getHeightOfColumn(int column) {
        
    }
    
    public void dropToken(int column) {
        
    }
}