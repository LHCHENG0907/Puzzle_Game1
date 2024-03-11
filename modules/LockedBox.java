package modules;

import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

import attributes._暫時封印_危險_隨時解封_DragDecorator;
import attributes.DrawbleComponent;

public class LockedBox extends DrawbleComponent {
    public BufferedImage UpImage, DownImage;
    _暫時封印_危險_隨時解封_DragDecorator draggableController;

    public LockedBox(int X, int Y, BufferedImage UpImage, BufferedImage DownImage) {
        super();
        this.UpImage = UpImage;// 儲存圖片
        this.DownImage = DownImage;// 儲存圖片

        setBounds(X, Y, UpImage.getWidth(), UpImage.getHeight()); // 設定座標
        draggableController = new _暫時封印_危險_隨時解封_DragDecorator(this);
    }

    @Override
    public void draw(Graphics2D g2D) {
        g2D.drawImage(UpImage, getX(), getY(), getWidth(), getHeight(), null);
    }

}
