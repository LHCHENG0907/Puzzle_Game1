package scenes;

import modules.ImageDisplay;

import java.awt.image.BufferedImage;

import attributes.Scene;
import images.ImageReader;

public class Entry extends Scene {
    ImageDisplay background;

    public Entry() {
        super();
        this.Unlock();// 解鎖場景供玩家進入

        // 以下可以自由的搭建場景
        BufferedImage background_image = ImageReader.FromPath("Images/background/message_board.png");
        background = new ImageDisplay(0, 0, background_image);

        getScene().addComposite(background);

    }

}
