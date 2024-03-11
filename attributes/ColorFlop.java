package attributes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import attributes.Lock.LockState;
import attributes.Lock.Lockble;

public class ColorFlop extends DrawbleComponent implements MouseListener, Lockble {
    private Color backColor, frontColor;
    private Rectangle rectangle;
    private boolean isOpen = false;
    private LockState lockState = new LockState();

    public ColorFlop(Rectangle r, Color back, Color front) {
        backColor = back;
        frontColor = front;
        rectangle = r;
    }

    public boolean IsOpen() {
        return isOpen;
    }

    @Override
    public void draw(Graphics2D g2d) {
        if (isOpen)
            g2d.setColor(frontColor);// 打開的顏色
        else
            g2d.setColor(backColor); // 沒開的顏色

        g2d.fill(rectangle); // 繪製
    }

    public void open() {
        if (lockState.IsLocked()) { // 如果在解鎖狀態
            isOpen = true; // 開牌
        }
    }

    public void close() {
        if (lockState.IsLocked()) { // 如果在解鎖狀態
            isOpen = false; // 關牌

        }
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
        if (rectangle.getBounds().contains(e.getPoint())) {// 點在範圍內
            this.open(); // 開牌
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
