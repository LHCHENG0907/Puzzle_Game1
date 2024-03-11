package attributes;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class ColorFlyweight {
    private Map<String, Color> colors = new HashMap<>();

    public Color getColor(String colorName) {
        if (!colors.containsKey(colorName)) {
            colors.put(colorName, ColorFactory.getColor(colorName));
        }
        return colors.get(colorName);
    }
}
