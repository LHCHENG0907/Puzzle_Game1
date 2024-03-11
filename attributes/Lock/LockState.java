package attributes.Lock;

public class LockState implements Lockble {
    private boolean isLocked;

    public LockState() {
        isLocked = true;
    }

    public LockState(boolean state) {
        isLocked = state;
    }

    @Override
    public void Lock() {
        isLocked = true;
    }

    @Override
    public void Unlock() {
        isLocked = false;
    }

    @Override
    public boolean IsLocked() {
        return isLocked;
    }

}
