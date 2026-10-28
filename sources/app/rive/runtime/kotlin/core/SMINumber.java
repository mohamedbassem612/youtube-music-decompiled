package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SMINumber extends SMIInput {
    public static final int $stable = SMIInput.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMINumber(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppSetValue(long j, float f);

    private final native float cppValue(long j);

    public final float getValue() {
        float fCppValue;
        synchronized (getFileLock()) {
            fCppValue = cppValue(getCppPointer());
        }
        return fCppValue;
    }

    public final void setValue$third_party_java_android_libs_rive_rive_android(float f) {
        synchronized (getFileLock()) {
            cppSetValue(getCppPointer(), f);
        }
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMINumber " + getName() + '\n';
    }
}
