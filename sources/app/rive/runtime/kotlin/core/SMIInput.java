package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SMIInput extends NativeObject {
    public static final int $stable = 8;
    private final ReentrantLock fileLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMIInput(long j, ReentrantLock reentrantLock) {
        super(j);
        reentrantLock.getClass();
        this.fileLock = reentrantLock;
    }

    private final native boolean cppIsBoolean(long j);

    private final native boolean cppIsNumber(long j);

    private final native boolean cppIsTrigger(long j);

    private final native String cppName(long j);

    protected final ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public final String getName() {
        String strCppName;
        synchronized (this.fileLock) {
            strCppName = cppName(getCppPointer());
        }
        return strCppName;
    }

    public final boolean isBoolean() {
        boolean zCppIsBoolean;
        synchronized (this.fileLock) {
            zCppIsBoolean = cppIsBoolean(getCppPointer());
        }
        return zCppIsBoolean;
    }

    public final boolean isNumber() {
        boolean zCppIsNumber;
        synchronized (this.fileLock) {
            zCppIsNumber = cppIsNumber(getCppPointer());
        }
        return zCppIsNumber;
    }

    public final boolean isTrigger() {
        boolean zCppIsTrigger;
        synchronized (this.fileLock) {
            zCppIsTrigger = cppIsTrigger(getCppPointer());
        }
        return zCppIsTrigger;
    }

    public String toString() {
        return "SMIInput " + getName() + '\n';
    }
}
