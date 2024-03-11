package commands;

import attributes.Command;
import attributes.Scene;

public class SceneUnlockCommand implements Command {
    Scene scene;

    public SceneUnlockCommand(Scene s) {
        scene = s;
    }

    @Override
    public void execut() {
        scene.getLockState().Unlock();
    }

}
