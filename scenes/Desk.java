package scenes;

import modules.DigitalSelectionUnit;
import modules.ImageDisplay;

import java.awt.image.BufferedImage;

import attributes.Scene;
import images.ImageReader;

public class Desk extends Scene {
    DigitalSelectionUnit digitalSelectionUnit;

    public Desk() {
        super();
        this.Unlock();// 解鎖場景供玩家進入

        // 以下可以自由的搭建場景
        BufferedImage background_image = ImageReader.FromPath("Images/background/wooden_table.png");
        ImageDisplay background = new ImageDisplay(0, 0, background_image);

        digitalSelectionUnit = new DigitalSelectionUnit(400, 200, 5);

        getScene().addComposite(background);
        getScene().addComposite(digitalSelectionUnit);
        getMouseListeners().add(digitalSelectionUnit);

    }

}
