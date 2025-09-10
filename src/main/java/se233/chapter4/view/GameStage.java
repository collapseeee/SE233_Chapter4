package se233.chapter4.view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import se233.chapter4.Launcher;
import se233.chapter4.model.GameCharacter;
import se233.chapter4.model.Keys;

public class GameStage extends Pane {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 400;
    public final static int GROUND = 300;
    private Image gameStageImage;
    private GameCharacter gameCharacter;
    private GameCharacter gameCharacter2;
    private Keys keys;
    public GameStage() {
        keys = new Keys();
        gameStageImage = new Image(Launcher.class.getResourceAsStream("assets/Background.png"));
        ImageView backgroundImg = new ImageView(gameStageImage);
        backgroundImg.setFitHeight(HEIGHT);
        backgroundImg.setFitWidth(WIDTH);
        gameCharacter = new GameCharacter(30, 30, 0, 0, KeyCode.A, KeyCode.D, KeyCode.W, "assets/MarioSheet.png", 7, 17);
        gameCharacter2 = new GameCharacter(700,30,0,0, KeyCode.LEFT, KeyCode.RIGHT, KeyCode.UP, "assets/rockman.png", 15, 12);
        getChildren().addAll(backgroundImg, gameCharacter, gameCharacter2);
    }
    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }
    public GameCharacter getGameCharacter2() {
        return gameCharacter2;
    }
    public Keys getKeys() {
        return keys;
    }
}
