package net.tullco.walkingsimulator.statetransitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.tullco.walkingsimulator.StateTransition;
import net.tullco.walkingsimulator.exceptions.InvalidStateTransitionException;
import net.tullco.walkingsimulator.models.Level;

public class StartLevel implements StateTransition {

	private static String[] validOldStates = {"INIT","FINISH"}; 
	
	public StartLevel(Level level){
		
	}
	
	@Override
	public void update() throws InvalidStateTransitionException {
		
	}

	@Override
	public List<String> getValidOldStates(){
		return new ArrayList<String>(Arrays.asList(validOldStates));
	}
}
