package net.tullco.walkingsimulator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.util.Duration;

public class WalkingSimulator extends Application {
	public static final int FPS = 60;

	public static void main(String[] args) {
		launch();
	}
	@Override
	public void init(){
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Walking Simulator 2016");
		Group root = new Group();
		Scene primaryScene = new Scene(root);
		View theView = new View(root);
		primaryStage.setScene(primaryScene);
		primaryStage.show();
		Timeline gameLoop = new Timeline();
		Timeline debugLoop = new Timeline();
        gameLoop.setCycleCount( Timeline.INDEFINITE );
        debugLoop.setCycleCount( Timeline.INDEFINITE );
		KeyFrame kf = new KeyFrame(
				Duration.seconds(1d/FPS),
				new EventHandler<ActionEvent>(){
					public void handle(ActionEvent ae){
					};
				});
        KeyFrame kf_debug = new KeyFrame(
                Duration.seconds(1),
                new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent ae){}
			});
        gameLoop.getKeyFrames().add( kf );
        debugLoop.getKeyFrames().add( kf_debug );
        gameLoop.play();
        debugLoop.play();
        
	}
}
