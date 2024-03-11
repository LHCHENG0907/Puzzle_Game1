package scenes;

import java.awt.image.BufferedImage;
import modules.ImageDisplay;
import attributes.Scene;
import images.ImageReader;

public class Finish extends Scene {
    ImageDisplay background;
    ImageDisplay box;

    public Finish() {
        super();
        this.Unlock();//解鎖場景供玩家進入

        BufferedImage background_image = ImageReader.FromPath("Images/background/blank_picture_frame.png");
        BufferedImage box_image = ImageReader.FromPath("Images/props/box.png");
        background = new ImageDisplay(0, 0, background_image);
        box = new ImageDisplay(150, 170, box_image);

        getScene().addComposite(background);
        getScene().addComposite(box);

    }

}
