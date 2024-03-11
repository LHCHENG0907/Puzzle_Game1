package commands;

import attributes.Command;
import attributes.Scene;

public class SceneLockCommand implements Command {
    Scene scene;

    public SceneLockCommand(Scene s) {
        scene = s;
    }

    @Override
    public void execut() {
        scene.getLockState().Lock();
    }

}
