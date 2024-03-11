package modules;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import attributes.ColorFlop;
import attributes.ColorFlopPair;
import attributes.ColorFlyweight;
import attributes.Drawble;
import attributes.Lock.LockStateComposite;
import attributes.Lock.Lockble;

public class ColorFlopMatrix implements Drawble, Lockble, MouseListener {
    final ArrayList<String> colors = new ArrayList<String>(
            Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "purple", "gray"));
    private ArrayList<ColorFlopPair> colorFlopPairs = new ArrayList<ColorFlopPair>();
    private LockStateComposite lockState = new LockStateComposite();

    public ColorFlopMatrix(int x, int y, ColorFlyweight cf) {
        ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();
        for (int iy = 0; iy < 4; iy++) {
            for (int ix = 0; ix < 4; ix++) {
                rectangleList.add(new Rectangle(x + 55 * ix, y + 55 * iy, 50, 50));
            }
        } // 生成方塊陣列

        Collections.shuffle(rectangleList);// 打亂index
        Color backColor = cf.getColor("black");// 卡背面為黑色
        for (int i = 0; i < 8; i++) { // 產生對
            Color c = cf.getColor(colors.get(i));
            Rectangle ra = rectangleList.get(i);
            Rectangle rb = rectangleList.get(i + 8);
            ColorFlop colorFlopA = new ColorFlop(ra, backColor, c);
            ColorFlop colorFlopB = new ColorFlop(rb, backColor, c);
            ColorFlopPair colorFlopPair = new ColorFlopPair(colorFlopA, colorFlopB);
            colorFlopPairs.add(colorFlopPair);// 儲存翻牌隊
            lockState.addComposite(colorFlopPair);// 翻牌隊的上鎖聚合
        }
    }

    @Override
    public void draw(Graphics2D g2d) {
        colorFlopPairs.forEach(cfp -> cfp.draw(g2d)); // 繪製所有翻牌對
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
        for (ColorFlopPair colorFlopPair : colorFlopPairs) {
            colorFlopPair.mouseClicked(e);
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
