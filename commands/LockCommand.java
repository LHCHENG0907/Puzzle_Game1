package commands;

import attributes.Command;
import attributes.Lock.LockState;

public class LockCommand implements Command {
    public LockState lockState;

    public LockCommand(LockState ls) {
        lockState = ls;
    }

    @Override
    public void execut() {
        lockState.Lock();
    }

}
