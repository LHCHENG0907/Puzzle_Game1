package attributes.Lock;

import attributes.Composite;

public class LockStateComposite extends Composite<Lockble> implements Lockble {
    private LockState lock;

    public LockStateComposite() {
        super();
        lock = new LockState();
    }

    @Override
    public void Lock() {
        lock.Lock();
    }

    @Override
    public void Unlock() {
        lock.Unlock();
    }

    @Override
    public boolean IsLocked() {
        if (lock.IsLocked()) {// 自身上鎖
            return true; // 回傳上鎖
        }
        for (Lockble lock : compositeChilds) {
            if (lock.IsLocked()) { // 子物件中有上鎖
                return true; // 回傳上所
            }
        }
        return false;// 全都通過就是沒上鎖
    }

}
