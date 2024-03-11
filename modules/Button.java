package modules;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//import java.awt.Point;
//import javax.swing.SwingUtilities;

import attributes.Command;
import attributes.DrawbleComponent;

public class Button extends DrawbleComponent implements MouseListener {
    Command command;
    ImageDisplay imageDisplay;

    public Button(Command c, ImageDisplay i) {
        super();
        command = c;
        imageDisplay = i;
    }

    @Override
    public void draw(Graphics2D g2d) {
        imageDisplay.draw(g2d);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Point locatino = SwingUtilities.convertPoint(imageDisplay, e.getPoint(),
        // imageDisplay.getParent());
        if (imageDisplay.getBounds().contains(e.getPoint())) {
            command.execut(); // 執行指令
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
