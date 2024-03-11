package main.UserIntputHandlers;

import java.awt.event.MouseEvent;//滑鼠事件
import java.awt.event.MouseListener;//滑鼠事件監聽器
import java.util.HashSet;
import java.util.Set;

import attributes.Observer;

public class MouseHandler implements Observer<MouseListener>, MouseListener {
    public Set<MouseListener> mouseListeners = new HashSet<MouseListener>();

    @Override
    public void mouseClicked(MouseEvent e) {
        for (MouseListener mouseListener : mouseListeners) {
            mouseListener.mouseClicked(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (MouseListener mouseListener : mouseListeners) {
            mouseListener.mousePressed(e);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (MouseListener mouseListener : mouseListeners) {
            mouseListener.mouseReleased(e);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (MouseListener mouseListener : mouseListeners) {
            mouseListener.mouseEntered(e);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (MouseListener mouseListener : mouseListeners) {
            mouseListener.mouseExited(e);
        }
    }

    @Override
    public void addObserver(MouseListener object) {
        mouseListeners.add(object);
    }

    @Override
    public void removeObserver(MouseListener object) {
        mouseListeners.remove(object);
    }

}
