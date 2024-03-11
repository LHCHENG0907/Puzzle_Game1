package modules;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import attributes.DrawbleComposite;
import attributes.Lock.LockState;
import attributes.Lock.Lockble;
import commands.ImageFlapDisplayBackCommand;
import commands.ImageFlapDisplayNextCommand;
import images.ImageReader;

public class DigitalSelectionUnit extends DrawbleComposite implements MouseListener, Lockble {
    final int width = 60, height = 30;
    ImageFlapDisplay flapImageDisplay;
    Button upButton, downButton;
    int unlockNumber;
    LockState lockState = new LockState();;

    public DigitalSelectionUnit(int x, int y, int unlockNumber) {
        this.unlockNumber = unlockNumber;

        ImageDisplay numberOne = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/one.png"));
        ImageDisplay numberTwo = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/two.png"));
        ImageDisplay numberThree = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/three.png"));
        ImageDisplay numberFour = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/four.png"));
        ImageDisplay numberFive = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/five.png"));
        ImageDisplay numberSix = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/six.png"));
        ImageDisplay numberSeven = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/seven.png"));
        ImageDisplay numberEight = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/eight.png"));
        ImageDisplay numberEine = new ImageDisplay(x, y + 50, ImageReader.FromPath("Images/number/nine.png"));

        flapImageDisplay = new ImageFlapDisplay();
        flapImageDisplay.addDisplay(numberOne);
        flapImageDisplay.addDisplay(numberTwo);
        flapImageDisplay.addDisplay(numberThree);
        flapImageDisplay.addDisplay(numberFour);
        flapImageDisplay.addDisplay(numberFive);
        flapImageDisplay.addDisplay(numberSix);
        flapImageDisplay.addDisplay(numberSeven);
        flapImageDisplay.addDisplay(numberEight);
        flapImageDisplay.addDisplay(numberEine);
        addComposite(flapImageDisplay);

        ImageFlapDisplayNextCommand upCommand = new ImageFlapDisplayNextCommand(flapImageDisplay);
        ImageFlapDisplayBackCommand downCommand = new ImageFlapDisplayBackCommand(flapImageDisplay);

        ImageDisplay up_image = new ImageDisplay(x, y, ImageReader.FromPath("Images/button/up.png"));
        upButton = new Button(upCommand, up_image);
        addComposite(upButton);

        ImageDisplay down_image = new ImageDisplay(x, y + 100, ImageReader.FromPath("Images/button/down.png"));
        downButton = new Button(downCommand, down_image);
        addComposite(downButton);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        upButton.mouseClicked(e);
        downButton.mouseClicked(e);
        // 在所有按鈕觸發後變動上鎖狀態
        int index = flapImageDisplay.getIndex();
        if (index == unlockNumber) {
            lockState.Unlock();
        } else {
            lockState.Lock();
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void Lock() {
        lockState.Lock();

    }

    @Override
    public void Unlock() {
        lockState.Unlock();

    }

    @Override
    public boolean IsLocked() {
        return lockState.IsLocked();
    }
}
