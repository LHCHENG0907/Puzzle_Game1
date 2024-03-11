package commands;

import attributes.Command;
import levelsHandl.LevelsMaster;

public class LevelsMasterBackSceneCommand implements Command {
    LevelsMaster levelsMaster;

    public LevelsMasterBackSceneCommand(LevelsMaster lm) {
        levelsMaster = lm;
    }

    @Override
    public void execut() {
        levelsMaster.backScene();
    }

}
