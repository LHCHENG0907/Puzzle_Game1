package modules;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import attributes.DrawbleComponent;

public class ImageDisplay extends DrawbleComponent {
    public BufferedImage image;

    public ImageDisplay(int X, int Y, BufferedImage BI) {
        super();
        image = BI;// 儲存圖片
        setBounds(X, Y, BI.getWidth(), BI.getHeight()); // 設定座標
    }

    @Override
    public void draw(Graphics2D g2D) {
        g2D.drawImage(image, this.getX(), this.getY(), this.getWidth(), this.getHeight(), null);
    }

}
