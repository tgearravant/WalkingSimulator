package net.tullco.walkingsimulator.models;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class PlayerCharacter implements Renderable, ControllableSprite {

	private final static int CHARACTER_W=50;
	private final static int CHARACTER_H=100;
	
	private int xLoc;
	private int yLoc;
	
	private Shape playerShape;
	private Group playerGroup;
	
	private Level level;
	
	public PlayerCharacter(Group g, Level l){
		this.level=l;
		this.playerGroup = g;
		this.xLoc=l.getStartingX();
		this.yLoc=l.getStartingY();
		this.playerShape=new Rectangle(CHARACTER_W, CHARACTER_H);
		this.playerShape.setTranslateX(0);
		this.playerShape.setTranslateY(0);
		this.playerShape.setFill(Color.BLACK);
		this.playerGroup.getChildren().add(playerShape);
	}
	
	public boolean checkCollision(){
		if(checkCollisionRight() || checkCollisionLeft() || checkCollisionUp() || checkCollisionDown())
			return true;
		return false;
	}
	
	public boolean checkCollisionRight(){
		return level.checkCollision(getRightRectangle());
	}
	
	public Rectangle getRightRectangle(){
		return null;
	}
	
	public boolean checkCollisionLeft(){
		return true;
	}
	
	public boolean checkCollisionDown(){
		return true;
	}
	
	public boolean checkCollisionUp(){
		return true;
	}
	
	@Override
	public void startMotionX(boolean rightLeft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotionX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startMotionY(boolean upDown) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotionY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

}
