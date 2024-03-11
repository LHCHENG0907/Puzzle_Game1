package commands;

import attributes.Command;
import attributes.Lock.LockState;

public class UnLockCommand implements Command {
    public LockState lockState;

    public UnLockCommand(LockState ls) {
        lockState = ls;
    }

    @Override
    public void execut() {
        lockState.Unlock();
    }
}
