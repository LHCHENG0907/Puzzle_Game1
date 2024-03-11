package images;

import java.awt.image.BufferedImage;

import java.io.File;//io檔案包裝物件
import java.io.IOException;//IO例外
import javax.imageio.ImageIO;//IO工具

public class ImageReader {
    public static BufferedImage FromPath(String path) {
        File file = new File(path);
        try {
            return ImageIO.read(file);
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }

    }
}
