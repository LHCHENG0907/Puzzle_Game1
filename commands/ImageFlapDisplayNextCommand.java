package commands;

import attributes.Command;
import modules.ImageFlapDisplay;

public class ImageFlapDisplayNextCommand implements Command {
    ImageFlapDisplay imageFlapDisplay;

    public ImageFlapDisplayNextCommand(ImageFlapDisplay ifd) {
        imageFlapDisplay = ifd;
    }

    @Override
    public void execut() {
        System.out.println("上按鈕被點");
        imageFlapDisplay.next();
    }

}
