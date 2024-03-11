package commands;

import attributes.Command;
import levelsHandl.LevelsMaster;

public class LevelsMasterNextSceneCommand implements Command {
    LevelsMaster levelsMaster;

    public LevelsMasterNextSceneCommand(LevelsMaster lm) {
        levelsMaster = lm;
    }

    @Override
    public void execut() {
        levelsMaster.nextScene();
    }

}
