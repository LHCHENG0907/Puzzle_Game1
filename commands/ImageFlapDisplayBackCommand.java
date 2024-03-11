package commands;

import attributes.Command;
import modules.ImageFlapDisplay;

public class ImageFlapDisplayBackCommand implements Command {
    ImageFlapDisplay imageFlapDisplay;

    public ImageFlapDisplayBackCommand(ImageFlapDisplay ifd) {
        imageFlapDisplay = ifd;
    }

    @Override
    public void execut() {
        System.out.println("下按鈕被點");
        imageFlapDisplay.back();
    }

}
