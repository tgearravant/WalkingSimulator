package net.tullco.walkingsimulator;

import javafx.scene.Group;
import net.tullco.walkingsimulator.models.Level;
import net.tullco.walkingsimulator.models.PlayerCharacter;

public class View  {

	public static final int RESOLUTION_X=1024;
	public static final int RESOLUTION_Y=768;
	
	private static Group root;
	//private Canvas renderCanvas;
	private static Group levelGroup;
	private static Group playerGroup;
	private static Group hudGroup;
	private static PlayerCharacter player;
	private static Level level;

	//Construct the scene graph from the root node.

	public static void init(Group root){
		//Canvas c = new Canvas(RESOLUTION_X,RESOLUTION_Y);
		levelGroup = new Group();
		playerGroup = new Group();
		hudGroup = new Group();
		//this.renderCanvas = c;
		View.root=root;
		View.root.getChildren().add(levelGroup);
		View.root.getChildren().add(playerGroup);
		View.root.getChildren().add(hudGroup);
	}
	public static void setLevel(Level l){
		View.level=l;
	}
	public static Group getLevelGroup(){
		return View.levelGroup;
	}
	public static void setPlayer(PlayerCharacter p){
		View.player=p;
	}
	public static Group getPlayerGroup(){
		return View.playerGroup;
	}
	public static void setHud(){}
	public static void draw() {
		level.render();
		player.render();
	}
}