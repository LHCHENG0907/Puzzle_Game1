package attributes.Lock;

import commands.LockCommand;
import commands.UnLockCommand;

public class LockStateProxy implements Lockble {
    private LockState lockState;
    private LockCommand lockCommand;
    private UnLockCommand unLockCommand;

    public LockStateProxy(LockState l) {
        lockState = l;
        lockCommand = new LockCommand(l);
        unLockCommand = new UnLockCommand(l);
    }

    @Override
    public void Lock() {
        lockState.Lock();
    }

    @Override
    public void Unlock() {
        lockState.Unlock();
    }

    @Override
    public boolean IsLocked() {
        return lockState.IsLocked();
    }

    public LockCommand GetLockCommand() {
        return lockCommand;
    }

    public UnLockCommand GetUnLockCommand() {
        return unLockCommand;
    }
}
