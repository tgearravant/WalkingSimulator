package net.tullco.walkingsimulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.tullco.walkingsimulator.exceptions.InvalidStateTransitionException;

public class State {

	private static String[] validStateArray = {"INIT","PLAYER1","PLAYER2","SCORE","FINISH","STOP"};
	
	private static View view;
	private static Controller controller;
	private static String state;
	private static List<String> validStates;
	
	public static void changeState(StateTransition t) throws InvalidStateTransitionException{
		if(!t.getValidOldStates().contains(State.state))
			throw new InvalidStateTransitionException();
		try{
			t.update();
		}catch(InvalidStateTransitionException e){
			if(e.getMessage()==null)
				throw e;
		}
	}
	public static View getView() {
		return view;
	}
	public static void setView(View view) {
		State.view = view;
	}
	public static Controller getController() {
		return controller;
	}
	public static void setController(Controller controller) {
		State.controller = controller;
	}
	public static List<String> getValidStates(){
		if(State.validStates!=null)
			return State.validStates;
		State.validStates = new ArrayList<String>(Arrays.asList(validStateArray));
		return State.validStates;
	}
}
