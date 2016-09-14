package net.tullco.walkingsimulator;

import java.util.List;

import net.tullco.walkingsimulator.exceptions.InvalidStateTransitionException;

public interface StateTransition {
	public void update() throws InvalidStateTransitionException;
	public List<String> getValidOldStates();
}
