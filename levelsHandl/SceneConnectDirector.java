package levelsHandl;

import attributes.Scene;

public class SceneConnectDirector {
    public static void TwoWayConnect(Scene a, Scene b) {
        a.getIterator().setNext(b);
        b.getIterator().setBack(a);
    }
}
