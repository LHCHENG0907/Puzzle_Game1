package main.UserIntputHandlers;

import java.util.HashSet;
import java.util.Set;

import attributes.Observer;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;//滑鼠作動監聽器

public class MouseMotionHandler implements Observer<MouseMotionListener>, MouseMotionListener {
    Set<MouseMotionListener> mouseMotionListeners = new HashSet<MouseMotionListener>();

    @Override
    public void addObserver(MouseMotionListener object) {
        mouseMotionListeners.add(object);
    }

    @Override
    public void removeObserver(MouseMotionListener object) {
        mouseMotionListeners.remove(object);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        for (MouseMotionListener mouseMotionListener : mouseMotionListeners) {
            mouseMotionListener.mouseDragged(e);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        for (MouseMotionListener mouseMotionListener : mouseMotionListeners) {
            mouseMotionListener.mouseMoved(e);
        }
    }

}
