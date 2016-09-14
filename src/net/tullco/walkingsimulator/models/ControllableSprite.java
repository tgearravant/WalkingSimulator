package net.tullco.walkingsimulator.models;

public interface ControllableSprite {
	/**
	 * Start movement on the X Axis. 
	 * @param rightLeft True for Right. False for left.
	 */
	public void startMotionX(boolean rightLeft);
	public void stopMotionX();
	/**
	 * Start movement on the Y Axis. 
	 * @param rightLeft True for Up. False for Down.
	 */
	public void startMotionY(boolean upDown);
	public void stopMotionY();
}
