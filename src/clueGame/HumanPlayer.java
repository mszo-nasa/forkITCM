package clueGame;

import java.awt.Color;

public class HumanPlayer extends Player {

	public HumanPlayer(String playerName, int row, int column, Color color) {
		super(playerName, row, column, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BoardCell pickLocation(int rollLength) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastRoom(char lastRoom) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean makeAccusation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Solution createSuggestion() {
		return null;
		// TODO Auto-generated method stub
		
	}
	
}
