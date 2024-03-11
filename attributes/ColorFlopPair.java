package attributes;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import attributes.Lock.LockState;
import attributes.Lock.Lockble;

public class ColorFlopPair implements MouseListener, Drawble, Lockble {
    private ColorFlop colorFlopA;
    private ColorFlop colorFlopB;
    private LockState lockState = new LockState();

    public ColorFlopPair(ColorFlop A, ColorFlop B) {
        colorFlopA = A;
        colorFlopB = B;
    }

    @Override
    public void draw(Graphics2D g2d) {
        colorFlopA.draw(g2d);// 繪製
        colorFlopB.draw(g2d);// 繪製
    }

    public void open() {
        colorFlopA.open();
        colorFlopB.open();
    }

    public void close() {
        colorFlopA.close();
        colorFlopB.close();

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

    @Override
    public void mouseClicked(MouseEvent e) {
        colorFlopA.mouseClicked(e);
        colorFlopB.mouseClicked(e);

        if (colorFlopA.IsOpen() & colorFlopB.IsOpen()) {// 配對成功
            colorFlopA.Unlock(); // 鎖住狀態
            colorFlopB.Unlock(); // 鎖住狀態
            lockState.Unlock(); // 通過
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

}
