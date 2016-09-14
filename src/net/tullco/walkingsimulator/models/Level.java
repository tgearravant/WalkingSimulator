package net.tullco.walkingsimulator.models;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Shape;

public abstract class Level implements Renderable {
	
	PlayerCharacter pc;
	ArrayList<Collidable> collidables;
	ArrayList<Renderable> renderables;
	
	public Level(){
	}
	@Override
	public void render(GraphicsContext gc) {
		
	}
	public boolean checkCollision(Shape s) {
		for(Collidable c: collidables){
			if(c.collision(s))
				return true;
		}
		return false;
	}
	public void addObject(Object o){
		if(o instanceof Collidable)
			collidables.add((Collidable) o);
		if(o instanceof Renderable)
			renderables.add((Renderable) o);
	}
}
