package net.tullco.walkingsimulator.models;

import javafx.scene.shape.Shape;

public interface Collidable {
	public boolean collision(Shape s);
}
