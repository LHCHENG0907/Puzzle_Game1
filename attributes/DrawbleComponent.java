package attributes;

import java.awt.Graphics2D;

import javax.swing.JComponent;

public abstract class DrawbleComponent extends JComponent implements Drawble {
    public abstract void draw(Graphics2D g2D);

    public DrawbleComponent() {
        super();
    }
}
