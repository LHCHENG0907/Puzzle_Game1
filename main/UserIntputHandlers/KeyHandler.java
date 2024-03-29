package main.UserIntputHandlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
    }

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                upPressed = true;

                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                downPressed = true;

                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                leftPressed = true;

                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                rightPressed = true;
                break;

            default:
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                upPressed = false;

                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                downPressed = false;

                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                leftPressed = false;

                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                rightPressed = false;
                break;

            default:
                break;
        }
    }

}
