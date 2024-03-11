package attributes;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import attributes.Lock.LockState;
import attributes.Lock.LockStateComposite;
import attributes.Lock.Lockble;
import levelsHandl.LevelIterator;

public class Scene implements Lockble {
    private LevelIterator iterator;
    private LockState lockState;
    private ArrayList<MouseListener> mouseListeners;
    private ArrayList<MouseMotionListener> mouseMotionListeners;
    private DrawbleComposite scene;
    private LockStateComposite lockStateComposite;

    public Scene() {
        mouseListeners = new ArrayList<MouseListener>();
        mouseMotionListeners = new ArrayList<MouseMotionListener>();
        scene = new DrawbleComposite();
        iterator = new LevelIterator();
        lockState = new LockState();
        lockStateComposite = new LockStateComposite();
    }

    public void setNextScene(Scene s) {
        iterator.setNext(s);
    }

    public void setBackScene(Scene s) {
        iterator.setBack(s);
    }

    public LockState getLockState() {
        return lockState;
    }

    public LevelIterator getIterator() {
        return iterator;
    }

    public ArrayList<MouseListener> getMouseListeners() {
        return mouseListeners;
    }

    public ArrayList<MouseMotionListener> getMouseMotionListeners() {
        return mouseMotionListeners;
    }

    public DrawbleComposite getScene() {
        return scene;
    }

    @Override
    public void Lock() {
        lockStateComposite.Lock();
    }

    @Override
    public void Unlock() {
        lockStateComposite.Unlock();
    }

    @Override
    public boolean IsLocked() {
        return lockStateComposite.IsLocked();
    }

}