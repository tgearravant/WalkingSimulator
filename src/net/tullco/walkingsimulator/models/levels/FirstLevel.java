package net.tullco.walkingsimulator.models.levels;

import net.tullco.walkingsimulator.models.Level;

public class FirstLevel extends Level {

	public static int GROUND_LEVEL = 50;
	public static int LEVEL_LENGTH = 2000;
	
	public FirstLevel() {
		super();
	}
	public int getGroundLevel(){
		return GROUND_LEVEL;
	}
	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getStartingX() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getStartingY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
