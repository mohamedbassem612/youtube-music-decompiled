package app.rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SMITrigger extends SMIInput {
    public static final int $stable = SMIInput.$stable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMITrigger(long j, ReentrantLock reentrantLock) {
        super(j, reentrantLock);
        reentrantLock.getClass();
    }

    private final native void cppFire(long j);

    public final void fire$third_party_java_android_libs_rive_rive_android() {
        synchronized (getFileLock()) {
            cppFire(getCppPointer());
        }
    }

    @Override // app.rive.runtime.kotlin.core.SMIInput
    public String toString() {
        return "SMITrigger " + getName() + '\n';
    }
}
