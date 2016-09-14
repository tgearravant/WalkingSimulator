package net.tullco.walkingsimulator;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import net.tullco.walkingsimulator.models.Renderable;

public class View  {

	public static final int RESOLUTION_X=1024;
	public static final int RESOLUTION_Y=768;

	public ArrayList<Renderable> renderables;
	
	private Group root;
	private Canvas renderCanvas;

	//Construct the scene graph from the root node.

	public View(Group root){
		Canvas c = new Canvas(RESOLUTION_X,RESOLUTION_Y);
		this.renderCanvas = c;
		this.root=root;
		this.root.getChildren().add(c);
	}
	
	public void draw() {
		for(Renderable r: renderables){
			r.render(this.renderCanvas.getGraphicsContext2D());
		}
	}
}
