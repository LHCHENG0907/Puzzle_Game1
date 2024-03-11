package scenes;

import attributes.ColorFlyweight;
import attributes.Scene;
import commands.LevelsMasterBackSceneCommand;
import commands.LevelsMasterNextSceneCommand;
import images.ImageReader;
import modules.Button;
import modules.ColorFlopMatrix;
import modules.ImageDisplay;

public class ColorFlopPuzzle extends Scene {
    private Button nextSceneButton;
    private Button backSceneButton;
    ColorFlopMatrix colorFlopMatrix;
    ColorFlyweight colorFlyweight = new ColorFlyweight();

    public ColorFlopPuzzle(LevelsMasterNextSceneCommand nextSceneCommand,
            LevelsMasterBackSceneCommand backSceneCommand) {
        super();
        colorFlopMatrix = new ColorFlopMatrix(50, 50, colorFlyweight);
        getScene().addComposite(colorFlopMatrix);
        getMouseListeners().add(colorFlopMatrix);
        ImageDisplay backButtonImage = new ImageDisplay(0, 450, ImageReader.FromPath("Images/button/left.png"));
        ImageDisplay nextButtonImage = new ImageDisplay(720, 450, ImageReader.FromPath("Images/button/right.png"));

        nextSceneButton = new Button(nextSceneCommand, nextButtonImage);
        backSceneButton = new Button(backSceneCommand, backButtonImage);

        getMouseListeners().add(nextSceneButton);
        getMouseListeners().add(backSceneButton);

    }
}
