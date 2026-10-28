package app.rive.core;

import app.rive.RiveLog;
import app.rive.RiveResourceClosedException;
import defpackage.awqg;
import defpackage.awqx;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RCPointer implements RefCounted {
    private static final String TAG = "Rive/RCPointer";
    private final long cppPointer;
    private AtomicBoolean disposed;
    private final String label;
    private final awqg onDispose;
    private AtomicInteger referenceCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RCPointer(long j, String str, awqg awqgVar) {
        str.getClass();
        awqgVar.getClass();
        this.cppPointer = j;
        this.label = str;
        this.onDispose = awqgVar;
        this.referenceCount = new AtomicInteger(1);
        this.disposed = new AtomicBoolean(false);
    }

    static final String release$lambda$0(RCPointer rCPointer, String str, String str2) {
        return "Releasing " + rCPointer.label + " (source: " + str + str2 + "; ref count before release: " + rCPointer.referenceCount.get() + ')';
    }

    static final String tryAcquire$lambda$0(RCPointer rCPointer, String str, int i) {
        return "Acquiring " + rCPointer.label + " (source: " + str + "; ref count before acquire: " + i + ')';
    }

    @Override // app.rive.core.RefCounted
    public void acquire(String str) {
        str.getClass();
        if (tryAcquire$third_party_java_android_libs_rive_rive_android(str)) {
            return;
        }
        throw new RiveResourceClosedException("RCPointer " + this.label + " is closed");
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (this.referenceCount.get() > 0) {
            return this.cppPointer;
        }
        throw new RiveResourceClosedException("RCPointer " + this.label + " is closed");
    }

    @Override // app.rive.core.RefCounted
    public int getRefCount() {
        return this.referenceCount.get();
    }

    @Override // app.rive.core.RefCounted
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // app.rive.core.RefCounted
    public void release(final String str, String str2) {
        str.getClass();
        str2.getClass();
        final String strConcat = str2.length() == 0 ? "" : "; reason: ".concat(str2);
        RiveLog.INSTANCE.getLogger().v(TAG, new Function0() { // from class: app.rive.core.RCPointer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RCPointer.release$lambda$0(this.f$0, str, strConcat);
            }
        });
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            if (iDecrementAndGet == 0) {
                RiveLog.INSTANCE.getLogger().d(TAG, new Function0() { // from class: app.rive.core.RCPointer$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return "Disposing ".concat(String.valueOf(this.f$0.label));
                    }
                });
                this.onDispose.invoke(Long.valueOf(this.cppPointer));
                this.disposed.set(true);
                return;
            }
            return;
        }
        throw new IllegalStateException("RCPointer " + this.label + " (source: " + str + strConcat + ") released too many times.");
    }

    public final boolean tryAcquire$third_party_java_android_libs_rive_rive_android(final String str) {
        final int i;
        str.getClass();
        do {
            i = this.referenceCount.get();
            if (i <= 0) {
                return false;
            }
        } while (!this.referenceCount.compareAndSet(i, i + 1));
        RiveLog.INSTANCE.getLogger().v(TAG, new Function0() { // from class: app.rive.core.RCPointer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RCPointer.tryAcquire$lambda$0(this.f$0, str, i);
            }
        });
        return true;
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
