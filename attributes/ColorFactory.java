package attributes;

import java.awt.Color;

public class ColorFactory {

    static public Color getColor(String colorName) {
        switch (colorName) {
            case "red":
                return new Color(255, 80, 80);
            case "orange":
                return new Color(255, 180, 80);
            case "yellow":
                return new Color(255, 255, 80);
            case "green":
                return new Color(80, 255, 80);
            case "blue":
                return new Color(80, 80, 255);
            case "indigo":
                return new Color(80, 255, 255);
            case "purple":
                return new Color(255, 80, 255);
            case "white":
                return new Color(255, 255, 255);
            case "gray":
                return new Color(200, 200, 200);
            case "black":
                return new Color(0, 0, 0);
        }
        return null;
    }
}
