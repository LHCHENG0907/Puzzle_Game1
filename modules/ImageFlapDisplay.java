package modules;

import java.awt.Graphics2D;
import java.util.ArrayList;

import attributes.DrawbleComponent;

public class ImageFlapDisplay extends DrawbleComponent {
    public ArrayList<ImageDisplay> displays;
    public int index;

    public ImageFlapDisplay() {
        displays = new ArrayList<ImageDisplay>();
    }

    public void next() {
        index = (index + 1) % displays.size();
    }

    public void back() {
        index--;
        if (index == -1) {
            index = displays.size() - 1;
        }
    }

    public int getIndex() {
        return index;
    }

    public void addDisplay(ImageDisplay i) {
        displays.add(i);
    }

    public void removeDisplay(ImageDisplay i) {
        displays.remove(i);
    }

    @Override
    public void draw(Graphics2D g2d) {
        System.out.println("圖片集顯示器目前在第" + (index + 1) + "張圖片");

        if (index >= 0 & index < displays.size()) {
            displays.get(index).draw(g2d);
        }
    }
}
