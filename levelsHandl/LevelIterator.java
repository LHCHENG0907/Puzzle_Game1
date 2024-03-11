package levelsHandl;

import attributes.Scene;

public class LevelIterator {
    private Scene next = null;
    private Scene back = null;

    public void setNext(Scene screen) {
        next = screen;
    }

    public void setBack(Scene screen) {
        back = screen;
    }

    public Scene getNext() {
        return next;
    }

    public Scene getBack() {
        return back;
    }

    public boolean haveNext() {
        return !(next == null);
    }

    public boolean havetBack() {
        return !(back == null);
    }

}
