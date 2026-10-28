package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SMIBoolean extends SMIInput {
    public static final int $stable = SMIInput.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMIBoolean(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppSetValue(long j, boolean z);

    private final native boolean cppValue(long j);

    public final boolean getValue() {
        boolean zCppValue;
        synchronized (getFileLock()) {
            zCppValue = cppValue(getCppPointer());
        }
        return zCppValue;
    }

    public final void setValue$third_party_java_android_libs_rive_rive_android(boolean z) {
        synchronized (getFileLock()) {
            cppSetValue(getCppPointer(), z);
        }
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMIBoolean " + getName() + '\n';
    }
}
